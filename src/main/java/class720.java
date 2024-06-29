import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class720 implements class82 {

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Lcba;")
    private class576 field10428;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public int field10423;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public int field10427;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "[I")
    public int[] field10422;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Lcc;")
    private class760 field10420;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "[F")
    public float[] field10419;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10430 = new String[] { method5251(method5250("\u007f(TzXc")), method5251(method5250("kv\u001f:O")), method5251(method5250("s2\u001fW\u001a")), method5251(method5250("~-]x")), method5251(method5250("s2\u001fU\u001a")), method5251(method5250("s2\u001f([~1E*\u001a")), method5251(method5250("s2\u001fP\u001a")), method5251(method5250("s2\u001fV\u001a")) };

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Z")
    public static boolean field10429 = false;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field10421;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field10424;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field10425;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field10426;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
    public static final void method5248(int arg0, int arg1) {
        try {
            field10425++;
            class178 var2 = class245.field3750;
            synchronized (class245.field3750) {
                class245.field3750.method1557(arg0, (byte) -122);
                if (arg1 != 17289) {
                    field10429 = true;
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10430[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        try {
            field10421++;
            class209.method1841(arg6 ? this.field10422 : null, this.field10428.field8511.field9688, arg7 ? this.field10419 : null, arg0, arg3, this.field10427, arg2, arg7 ? this.field10428.field8534 : null, this.field10428.field8511.field9685, arg1, false, arg5, arg4);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field10430[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        try {
            class209.method1841(arg6 ? this.field10428.field8511.field9685 : null, this.field10427, arg7 ? this.field10428.field8534 : null, arg0, arg3, this.field10428.field8511.field9688, arg2, arg7 ? this.field10419 : null, this.field10422, arg1, false, arg5, arg4);
            field10424++;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field10430[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lmca;BILjava/lang/String;)Lvd;")
    public static final class42 method5249(class33 arg0, byte arg1, int arg2, String arg3) {
        try {
            field10426++;
            int var4 = -20 % ((arg1 - 53) / 48);
            return class38.method253(arg3, arg0, 1, arg2, field10430[0]);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10430[2] + (arg0 == null ? field10430[3] : field10430[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10430[3] : field10430[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lcba;Lfs;Lcc;)V")
    public class720(class576 arg0, class581 arg1, class760 arg2) {
        try {
            this.field10428 = arg0;
            if ((arg1 instanceof class453)) {
                class453 var5 = (class453) arg1;
                this.field10423 = var5.field7684;
                this.field10427 = var5.field7695;
                this.field10422 = var5.field6632;
            } else if ((arg1 instanceof class635)) {
                class635 var4 = (class635) arg1;
                this.field10423 = var4.field7684;
                this.field10427 = var4.field7695;
                this.field10422 = var4.field9248;
            } else {
                throw new RuntimeException();
            }
            if (arg2 != null) {
                this.field10420 = arg2;
                if (this.field10420.field11012 != this.field10427 || this.field10420.field11011 != this.field10423) {
                    throw new RuntimeException();
                }
                this.field10419 = this.field10420.field11009;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10430[5] + (arg0 == null ? field10430[3] : field10430[1]) + ',' + (arg1 == null ? field10430[3] : field10430[1]) + ',' + (arg2 == null ? field10430[3] : field10430[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5250(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5251(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 16;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
