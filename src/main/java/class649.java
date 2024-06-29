import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class649 {

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "Lpea;")
    private class665 field9196 = new class665();

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field9193;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "Lpea;")
    private class665 field9197;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)Lpea;", line = 3)
    public final class665 method3610(int arg0) {
        field9193++;
        class665 var2 = this.field9197;
        if (arg0 != -30295) {
            this.field9197 = null;
        }
        if (this.field9196 == var2) {
            this.field9197 = null;
            return null;
        } else {
            this.field9197 = var2.field9368;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)Lpea;", line = 25)
    public final class665 method3611(int arg0) {
        field9200++;
        class665 var2 = this.field9196.field9368;
        if (arg0 != 255) {
            this.field9197 = null;
        }
        if (this.field9196 == var2) {
            this.field9197 = null;
            return null;
        } else {
            this.field9197 = var2.field9368;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)I", line = 48)
    public final int method3612(boolean arg0) {
        field9195++;
        int var2 = 0;
        class665 var3 = this.field9196.field9368;
        if (!arg0) {
            this.method3616(115);
        }
        while (this.field9196 != var3) {
            var3 = var3.field9368;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(I)Lpea;", line = 69)
    public final class665 method3613(int arg0) {
        if (arg0 > -110) {
            return null;
        }
        field9198++;
        class665 var2 = this.field9196.field9368;
        if (this.field9196 == var2) {
            return null;
        } else {
            var2.method3691((byte) -119);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "([BI)Ljava/lang/String;", line = 93)
    public static final String method3614(byte[] arg0, int arg1) {
        field9201++;
        int var2 = arg0.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        int var5 = 0;
        if (arg1 <= 98) {
            method3614(null, -106);
        }
        while (var2 > var5) {
            int var6 = arg0[var5] & 0xFF;
            if (var6 < 128) {
                var3[var4++] = (char) var6;
            } else if (var6 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
            } else if (var6 < 224) {
                if (var2 <= (var5 + 1)) {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
                var5++;
                int var7 = arg0[var5] & 0xFF;
                if (var7 < 128 || var7 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var3[var4++] = (char) class266.method1624(class249.method1537(-193, var6) << 6, class249.method1537(-129, var7));
            } else if (var6 < 240) {
                if ((var5 + 2) >= var2) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var5++;
                int var8 = arg0[var5] & 0xFF;
                if (var8 < 128 || var8 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                var5++;
                int var9 = arg0[var5] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                var3[var4++] = (char) class266.method1624(class249.method1537(-129, var9), class266.method1624(class249.method1537(var8, -129) << 6, class249.method1537(-921600, var6 << 12)));
            } else if (var6 < 244) {
                throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
            } else {
                throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
            }
            var5++;
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V", line = 194)
    public class649() {
        this.field9196.field9368 = this.field9196;
        this.field9196.field9370 = this.field9196;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILpea;)V", line = 173)
    public final void method3615(int arg0, class665 arg1) {
        field9199++;
        if (arg1.field9370 != null) {
            arg1.method3691((byte) -119);
        }
        if (arg0 != -31531) {
            method3614(null, -20);
        }
        arg1.field9368 = this.field9196;
        arg1.field9370 = this.field9196.field9370;
        arg1.field9370.field9368 = arg1;
        arg1.field9368.field9370 = arg1;
    }

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "(I)V", line = 204)
    public final void method3616(int arg0) {
        if (arg0 != -129) {
            return;
        }
        while (true) {
            class665 var2 = this.field9196.field9368;
            if (this.field9196 == var2) {
                field9194++;
                this.field9197 = null;
                return;
            }
            var2.method3691((byte) -119);
        }
    }
}
