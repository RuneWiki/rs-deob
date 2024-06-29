import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class569 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lwq;")
    private class178 field8423 = new class178(64);

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Lwq;")
    public class178 field8428 = new class178(50);

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lwq;")
    public class178 field8429 = new class178(5);

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lla;")
    public class476 field8417;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lla;")
    private class476 field8414;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lto;")
    public class8 field8425;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Z")
    public boolean field8427;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8431 = new String[] { method4259(method4258("\u000b{J\u001b\u0006")), method4259(method4258("\u000b{J\u001c\u0006")), method4259(method4258("\u000b{J\u001e\u0006")), method4259(method4258("\u000b{J\u0011\u0006")), method4259(method4258("\u000b{J\u0010\u0006")), method4259(method4258("\u000b{J\u001f\u0006")), method4259(method4258("\u000b{J\u0019\u0006")), method4259(method4258("\u000b{J\u001d\u0006")), method4259(method4258("\u000b{J\u001a\u0006")), method4259(method4258("\bj\b4")), method4259(method4258("\u000b{JdG\bv\u0010f\u0006")), method4259(method4258("\u001d1JvS")) };

    @OriginalMember(owner = "client!md", name = "e", descriptor = "[I")
    public static int[] field8418 = new int[1000];

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field8416;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public int field8430;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method4249(int arg0) {
        try {
            field8426++;
            class178 var2 = this.field8423;
            synchronized (this.field8423) {
                this.field8423.method1559(0);
            }
            class178 var3 = this.field8428;
            synchronized (this.field8428) {
                this.field8428.method1559(arg0);
            }
            class178 var4 = this.field8429;
            synchronized (this.field8429) {
                this.field8429.method1559(0);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8431[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lmaa;")
    public final class496 method4250(int arg0, int arg1) {
        try {
            field8413++;
            class178 var3 = this.field8423;
            class496 var4;
            synchronized (this.field8423) {
                var4 = (class496) this.field8423.method1558((byte) 96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field8414;
            byte[] var6;
            synchronized (this.field8414) {
                var6 = this.field8414.method3632(class440.method3382(-909794393, arg0), class198.method1773(arg0, 127), -118);
            }
            if (arg1 != 2) {
                this.field8425 = null;
            }
            class496 var7 = new class496();
            var7.field7177 = arg0;
            var7.field7135 = this;
            if (var6 != null) {
                var7.method3751(new class163(var6), -525);
            }
            var7.method3749(0);
            class178 var8 = this.field8423;
            synchronized (this.field8423) {
                this.field8423.method1556((long) arg0, var7, arg1 ^ 0x3);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field8431[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IZ)V")
    public final void method4251(int arg0, boolean arg1) {
        try {
            field8415++;
            int var3 = 120 / ((arg0 - 66) / 51);
            if (arg1 != this.field8427) {
                this.field8427 = arg1;
                this.method4249(0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8431[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method4252(byte arg0) {
        try {
            field8418 = null;
            if (arg0 != 46) {
                field8416 = 21;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8431[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public final void method4253(int arg0) {
        try {
            class178 var2 = this.field8428;
            synchronized (this.field8428) {
                this.field8428.method1559(0);
            }
            field8419++;
            if (arg0 == 50) {
                class178 var3 = this.field8429;
                synchronized (this.field8429) {
                    this.field8429.method1559(0);
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field8431[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V")
    public final void method4254(int arg0, int arg1) {
        try {
            class178 var3 = this.field8423;
            synchronized (this.field8423) {
                this.field8423.method1557(arg1, (byte) -118);
            }
            field8420++;
            class178 var4 = this.field8428;
            synchronized (this.field8428) {
                this.field8428.method1557(arg1, (byte) -109);
                int var5 = -47 / ((-arg0 - 21) / 63);
            }
            class178 var6 = this.field8429;
            synchronized (this.field8429) {
                this.field8429.method1557(arg1, (byte) -117);
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field8431[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public final void method4255(int arg0) {
        try {
            field8424++;
            class178 var2 = this.field8423;
            synchronized (this.field8423) {
                this.field8423.method1569(10574);
            }
            class178 var3 = this.field8428;
            synchronized (this.field8428) {
                this.field8428.method1569(10574);
            }
            if (arg0 < 111) {
                method4252((byte) -84);
            }
            class178 var4 = this.field8429;
            synchronized (this.field8429) {
                this.field8429.method1569(10574);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8431[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static final void method4256(boolean arg0) {
        try {
            field8422++;
            client var1 = class43.field504;
            synchronized (class43.field504) {
                if (class2.field14 == null) {
                    Container var2;
                    if (class376.field5730 != null) {
                        var2 = class376.field5730;
                    } else if (class629.field9206 == null) {
                        var2 = class277.field4174;
                    } else {
                        var2 = class629.field9206;
                    }
                    class650.field9404 = var2.getSize().width;
                    class101.field1118 = var2.getSize().height;
                    if (class376.field5730 == var2) {
                        Insets var3 = class376.field5730.getInsets();
                        class101.field1118 -= var3.top + var3.bottom;
                        class650.field9404 -= var3.right + var3.left;
                    }
                    if (class451.method3463(1) == 1) {
                        class554.field8258 = 0;
                        class179.field2489 = class604.field8861;
                        class10.field103 = (class650.field9404 - class604.field8861) / 2;
                        class94.field1062 = class524.field7654;
                    } else {
                        class542.method4104(0);
                    }
                    if (class64.field667 != class31.field364) {
                        boolean var10000;
                        if (class179.field2489 < 1024 && class94.field1062 < 768) {
                            var10000 = true;
                        } else {
                            var10000 = false;
                        }
                    }
                    class502.field7252.setSize(class179.field2489, class94.field1062);
                    if (class610.field8913 != null) {
                        if (class235.field3549) {
                            client.method2678(class502.field7252, 104);
                        } else {
                            class610.field8913.method551(class502.field7252, class179.field2489, class94.field1062);
                        }
                    }
                    if (class376.field5730 == var2) {
                        Insets var4 = class376.field5730.getInsets();
                        class502.field7252.setLocation(var4.left + class10.field103, class554.field8258 + var4.top);
                    } else {
                        class502.field7252.setLocation(class10.field103, class554.field8258);
                    }
                    if (arg0) {
                        field8418 = null;
                    }
                    if (class742.field10801 != -1) {
                        class580.method4335((byte) 125, true);
                    }
                    class423.method3265((byte) -9);
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8431[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
    public final void method4257(int arg0, boolean arg1) {
        try {
            if (!arg1) {
                field8416 = -88;
            }
            field8421++;
            this.field8430 = arg0;
            class178 var3 = this.field8428;
            synchronized (this.field8428) {
                this.field8428.method1559(0);
            }
            class178 var4 = this.field8429;
            synchronized (this.field8429) {
                this.field8429.method1559(0);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field8431[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lto;IZLla;Lla;)V")
    public class569(class8 arg0, int arg1, boolean arg2, class476 arg3, class476 arg4) {
        try {
            this.field8417 = arg4;
            this.field8414 = arg3;
            this.field8425 = arg0;
            this.field8427 = arg2;
            if (this.field8414 != null) {
                int var6 = this.field8414.method3629((byte) 18) - 1;
                this.field8414.method3646(var6, (byte) -77);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field8431[10] + (arg0 == null ? field8431[9] : field8431[11]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8431[9] : field8431[11]) + ',' + (arg4 == null ? field8431[9] : field8431[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4258(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!md", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4259(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 102;
                    break;
                case 1:
                    var10005 = 31;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
