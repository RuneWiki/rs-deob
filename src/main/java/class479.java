import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class479 {

    @OriginalMember(owner = "client!dga", name = "o", descriptor = "I")
    private int field6667 = -1;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "Z")
    private boolean field6655 = false;

    @OriginalMember(owner = "client!dga", name = "p", descriptor = "[Ljava/lang/String;")
    private String[] field6668 = new String[0];

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
    private int field6654;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!dga", name = "h", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!dga", name = "i", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!dga", name = "j", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!dga", name = "k", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!dga", name = "l", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!dga", name = "m", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!dga", name = "n", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILjava/lang/String;)V", line = 4)
    public final void method2912(int arg0, String arg1) {
        if (arg0 == 7459) {
            this.method2913(arg1, this.field6667 + 1, (byte) 116);
            field6653++;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 19)
    private final void method2913(String arg0, int arg1, byte arg2) {
        if (this.field6667 < arg1) {
            this.field6667 = arg1;
        }
        field6656++;
        if (arg1 >= this.field6668.length) {
            this.method2917((byte) 112, arg1);
        }
        if (arg2 == 116) {
            this.field6668[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)I", line = 39)
    private final int method2914(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field6667 = 113;
        }
        field6666++;
        int var3 = this.field6668.length;
        while (arg0 >= var3) {
            if (!this.field6655) {
                var3 += this.field6654;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field6654 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IB)V", line = 68)
    public static final void method2915(int arg0, byte arg1) {
        class73.field1096 = 2;
        class336.field4726 = arg0;
        field6665++;
        long var2 = 0L;
        if (class420.field5918 == null) {
            class97.method663(35, -2);
            return;
        }
        class63 var4 = new class63(class428.method2654(class172.method1099(class420.field5918, 100), -23767));
        long var5 = var4.method475(880459872);
        class152.field2102 = var4.method475(880459872);
        class115.method733(class312.method2046(37, var5), true, "", (byte) 113);
        if (arg1 >= -122) {
            method2919(null, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)[Ljava/lang/String;", line = 98)
    public final String[] method2916(int arg0) {
        if (arg0 > -115) {
            this.field6667 = -67;
        }
        field6661++;
        String[] var2 = new String[this.field6667 + 1];
        class245.method1649(this.field6668, 0, var2, 0, this.field6667 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(BI)V", line = 112)
    private final void method2917(byte arg0, int arg1) {
        field6662++;
        String[] var3 = new String[this.method2914(arg1, 0)];
        class245.method1649(this.field6668, 0, var3, 0, this.field6668.length);
        this.field6668 = var3;
        if (arg0 < 93) {
            this.field6655 = false;
        }
    }

    @OriginalMember(owner = "client!dga", name = "toString", descriptor = "()Ljava/lang/String;", line = 128)
    public final String toString() {
        field6658++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field6667; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field6668[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IZI)Z", line = 163)
    public static final boolean method2918(int arg0, boolean arg1, int arg2) {
        field6660++;
        if (arg2 < 0 || arg0 < 0 || arg2 >= class692.field9623[1].length || arg0 >= class692.field9623[1][arg2].length) {
            return false;
        } else if (arg1) {
            return (class692.field9623[1][arg2][arg0] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "([BB)Ljava/lang/String;", line = 184)
    public static final String method2919(byte[] arg0, byte arg1) {
        if (arg1 != 87) {
            method2918(6, true, -78);
        }
        field6664++;
        return class62.method438(arg0.length, arg0, 0, (byte) -117);
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(IZ)V", line = 207)
    public class479(int arg0, boolean arg1) {
        this.field6654 = arg0;
        this.field6655 = arg1;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)I", line = 216)
    public static final int method2920(boolean arg0) {
        field6659++;
        if (arg0) {
            return 31;
        }
        if (class731.field10159 == null) {
            if (!class25.field320 && class655.field8752 != null) {
                return class655.field8752.field7760;
            }
            int var1 = class103.field1419.method1553((byte) 67);
            int var2 = class103.field1419.method1556(20);
            if (class17.field153) {
                if (var1 > class401.field5750 && var1 < (class746.field10270 + class401.field5750)) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class569.field7865; var4++) {
                        if (class484.field6743) {
                            int var9 = var4 * 16 + class686.field9524 + 33;
                            if (var2 > (var9 - 13) && var2 <= var9 + 3) {
                                var3 = var4;
                            }
                        } else {
                            int var8 = var4 * 16 + class686.field9524 + 31;
                            if (var2 > var8 - 13 && var2 <= (var8 + 3)) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var5 = 0;
                        class87 var6 = new class87(class176.field2411);
                        for (class272 var7 = (class272) var6.method606(-120); var7 != null; var7 = (class272) var6.method610(16068)) {
                            if (var3 == (var5++)) {
                                return ((class558) var7.field3951.field9462.field33).field7760;
                            }
                        }
                    }
                } else if (class610.field8211 != null && var1 > class530.field7345 && (class530.field7345 + class153.field2104) > var1) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class610.field8211.field3953; var11++) {
                        if (class484.field6743) {
                            int var15 = var11 * 16 + field6657 + 33;
                            if (var2 > var15 - 13 && var2 <= var15 + 3) {
                                var10 = var11;
                            }
                        } else {
                            int var16 = field6657 + (var11 * 16) + 31;
                            if (var16 - 13 < var2 && var2 <= (var16 + 3)) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class87 var13 = new class87(class610.field8211.field3951);
                        for (class558 var14 = (class558) var13.method606(-81); var14 != null; var14 = (class558) var13.method610(16068)) {
                            if (var10 == var12++) {
                                return var14.field7760;
                            }
                        }
                    }
                }
            } else if (class401.field5750 < var1 && (class746.field10270 + class401.field5750) > var1) {
                int var17 = -1;
                for (int var18 = 0; var18 < class284.field4103; var18++) {
                    if (class484.field6743) {
                        int var22 = class686.field9524 + ((class284.field4103 - var18 - 1) * 16) + 33;
                        if (var2 > var22 - 13 && var2 <= (var22 + 3)) {
                            var17 = var18;
                        }
                    } else {
                        int var23 = (class284.field4103 - var18 - 1) * 16 + class686.field9524 + 31;
                        if (var23 - 13 < var2 && var2 <= var23 + 3) {
                            var17 = var18;
                        }
                    }
                }
                if (var17 != -1) {
                    int var19 = 0;
                    class451 var20 = new class451(class290.field4161);
                    for (class558 var21 = (class558) var20.method2760((byte) 78); var21 != null; var21 = (class558) var20.method2763(26385)) {
                        if (var17 == var19++) {
                            return var21.field7760;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
