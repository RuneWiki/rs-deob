import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class315 {

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Lqd;")
    private class50 field4855 = null;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    private int field4861 = 65000;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Lqd;")
    private class50 field4860 = null;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    private int field4849;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4858 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4853 = "";

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4854 = 1;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "[Lbi;")
    public static class91[] field4859;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[B", line = 7)
    public final byte[] method2200(int arg0, int arg1) {
        field4850++;
        class50 var3 = this.field4855;
        synchronized (this.field4855) {
            try {
                Object var10000;
                if (this.field4860.method306((byte) 107) < (long) (arg0 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field4860.method301((long) (arg0 * 6), (byte) 45);
                this.field4860.method305(arg1, true, 6, class254.field3863);
                int var4 = (class254.field3863[2] & 0xFF) + ((class254.field3863[1] & 0xFF) << 8) + (class254.field3863[0] & 0xFF << 16);
                int var5 = (class254.field3863[4] & 0xFF << 8) + (((class254.field3863[3] & 0xFF) << 16) + (class254.field3863[5] & 0xFF));
                if (var4 < 0 || var4 > this.field4861) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || ((long) var5) > (this.field4855.method306((byte) 60) / 520L)) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    int var6 = 0;
                    byte[] var7 = new byte[var4];
                    int var8 = 0;
                    while (var6 < var4) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field4855.method301((long) (var5 * 520), (byte) 45);
                        int var9 = var4 - var6;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field4855.method305(0, true, var9 + 8, class254.field3863);
                        int var10 = ((class254.field3863[0] & 0xFF) << 8) + (class254.field3863[1] & 0xFF);
                        int var11 = (class254.field3863[6] & 0xFF) + ((class254.field3863[4] & 0xFF << 16) + (class254.field3863[5] & 0xFF << 8));
                        int var12 = (class254.field3863[2] & 0xFF << 8) + (class254.field3863[3] & 0xFF);
                        int var13 = class254.field3863[7] & 0xFF;
                        if (arg0 != var10 || var8 != var12 || this.field4849 != var13) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field4855.method306((byte) -115) / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var8++;
                        var5 = var11;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var7[var6++] = class254.field3863[var14 + 8];
                        }
                    }
                    byte[] var19 = var7;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z[BIII)Z", line = 87)
    private final boolean method2201(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field4862++;
        class50 var6 = this.field4855;
        synchronized (this.field4855) {
            try {
                int var7;
                boolean var10000;
                if (arg0) {
                    if (((long) (arg3 * 6 + 6)) > this.field4860.method306((byte) 32)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field4860.method301((long) (arg3 * 6), (byte) 45);
                    this.field4860.method305(0, true, 6, class254.field3863);
                    var7 = (class254.field3863[3] & 0xFF << 16) + (class254.field3863[5] & 0xFF) + ((class254.field3863[4] & 0xFF) << 8);
                    if (var7 <= 0 || (long) var7 > this.field4855.method306((byte) 81) / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field4855.method306((byte) -121) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class254.field3863[2] = (byte) arg2;
                class254.field3863[1] = (byte) (arg2 >> 8);
                class254.field3863[4] = (byte) (var7 >> 8);
                if (arg4 != -1) {
                    field4854 = -22;
                }
                class254.field3863[5] = (byte) var7;
                class254.field3863[3] = (byte) (var7 >> 16);
                class254.field3863[0] = (byte) (arg2 >> 16);
                this.field4860.method301((long) (arg3 * 6), (byte) 45);
                int var8 = 0;
                this.field4860.method310(class254.field3863, 6, (byte) 93, 0);
                int var9 = 0;
                while (true) {
                    if (var8 < arg2) {
                        label141: {
                            int var10 = 0;
                            if (arg0) {
                                this.field4855.method301((long) (var7 * 520), (byte) 45);
                                try {
                                    this.field4855.method305(0, true, 8, class254.field3863);
                                } catch (EOFException var18) {
                                    break label141;
                                }
                                var10 = (class254.field3863[5] & 0xFF << 8) + ((class254.field3863[4] & 0xFF << 16) + (class254.field3863[6] & 0xFF));
                                int var12 = ((class254.field3863[0] & 0xFF) << 8) + (class254.field3863[1] & 0xFF);
                                int var13 = (class254.field3863[2] & 0xFF << 8) + (class254.field3863[3] & 0xFF);
                                int var14 = class254.field3863[7] & 0xFF;
                                if (arg3 != var12 || var9 != var13 || this.field4849 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || this.field4855.method306((byte) 101) / 520L < (long) var10) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field4855.method306((byte) -99) + 519L) / 520L);
                                arg0 = false;
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class254.field3863[1] = (byte) arg3;
                            if ((arg2 - var8) <= 512) {
                                var10 = 0;
                            }
                            class254.field3863[2] = (byte) (var9 >> 8);
                            class254.field3863[4] = (byte) (var10 >> 16);
                            class254.field3863[3] = (byte) var9;
                            class254.field3863[5] = (byte) (var10 >> 8);
                            class254.field3863[7] = (byte) this.field4849;
                            int var15 = arg2 - var8;
                            var9++;
                            class254.field3863[0] = (byte) (arg3 >> 8);
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class254.field3863[6] = (byte) var10;
                            this.field4855.method301((long) (var7 * 520), (byte) 45);
                            this.field4855.method310(class254.field3863, 8, (byte) 93, 0);
                            this.field4855.method310(arg1, var15, (byte) 93, var8);
                            var7 = var10;
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III[B)Z", line = 217)
    public final boolean method2202(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 <= 44) {
            field4854 = -47;
        }
        field4852++;
        class50 var5 = this.field4855;
        synchronized (this.field4855) {
            if (arg1 < 0 || arg1 > this.field4861) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2201(true, arg3, arg1, arg0, -1);
            if (!var6) {
                var6 = this.method2201(false, arg3, arg1, arg0, -1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Llc;III)Ltb;", line = 242)
    public static final class234 method2203(class175 arg0, int arg1, int arg2, int arg3) {
        field4851++;
        if (class304.method2132((byte) -80, arg3, arg2, arg0)) {
            if (arg1 != -635) {
                field4859 = (class91[]) null;
            }
            return class45.method268((byte) -111);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 265)
    public static void method2204(int arg0) {
        if (arg0 != 0) {
            field4854 = 101;
        }
        field4853 = null;
        field4859 = null;
        field4858 = null;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(ILqd;Lqd;I)V", line = 307)
    public class315(int arg0, class50 arg1, class50 arg2, int arg3) {
        this.field4849 = arg0;
        this.field4861 = arg3;
        this.field4860 = arg2;
        this.field4855 = arg1;
    }

    @OriginalMember(owner = "client!jg", name = "toString", descriptor = "()Ljava/lang/String;", line = 297)
    public final String toString() {
        field4856++;
        return "Cache:" + this.field4849;
    }
}
