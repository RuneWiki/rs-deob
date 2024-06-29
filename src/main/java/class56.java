import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class56 {

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "Lui;")
    private class251 field780 = new class251(64);

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "Lui;")
    public class251 field794 = new class251(50);

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "Lui;")
    public class251 field795 = new class251(5);

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "Llga;")
    public class47 field787;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "Lfs;")
    public class796 field790;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "Llga;")
    private class47 field793;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    private int field782;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "Z")
    public boolean field789;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "[Ljava/lang/String;")
    private String[] field796;

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field799 = new String[] { method603(method602(".\u000b\u001bs\u001f")), method603(method602("4\u000e")), method603(method602(".\u000b\u001bp\u001f")), method603(method602(".\u000b\u001bu\u001f")), method603(method602(".\u000b\u001bt\u001f")), method603(method602(".\u000b\u001bw\u001f")), method603(method602(".\u000b\u001br\u001f")), method603(method602(".\u000b\u001bv\u001f")), method603(method602(".\u000b\u001by\u001f")), method603(method602(".\u000b\u001b\r^(\u0013A\u000f\u001f")), method603(method602("=T\u001b\u001fJ")), method603(method602("(\u000fY]")) };

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "J")
    public static long field785;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hq", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field798;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIZ)Z")
    public static final boolean method593(int arg0, int arg1, int arg2, boolean arg3) {
        try {
            field788++;
            class675 var4 = (class675) class185.method1526(arg1, arg2, arg0);
            boolean var5 = true;
            if (var4 != null) {
                var5 &= class342.method2749(-105, var4);
            }
            class675 var6 = (class675) class590.method4352(arg1, arg2, arg0, field798 == null ? (field798 = method601(field799[1])) : field798);
            if (var6 != null) {
                var5 &= class342.method2749(-126, var6);
            }
            class675 var7 = (class675) class254.method2130(arg1, arg2, arg0);
            if (arg3) {
                field785 = 74L;
            }
            if (var7 != null) {
                var5 &= class342.method2749(-78, var7);
            }
            return var5;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field799[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V")
    public final void method594(byte arg0) {
        try {
            class251 var2 = this.field780;
            synchronized (this.field780) {
                this.field780.method2047(11914);
            }
            field784++;
            class251 var3 = this.field794;
            synchronized (this.field794) {
                this.field794.method2047(11914);
            }
            if (arg0 == -47) {
                class251 var4 = this.field795;
                synchronized (this.field795) {
                    this.field795.method2047(11914);
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field799[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
    public final void method595(int arg0, int arg1) {
        try {
            field779++;
            class251 var3 = this.field780;
            synchronized (this.field780) {
                this.field780.method2038(arg0 ^ arg0, arg1);
            }
            class251 var4 = this.field794;
            synchronized (this.field794) {
                this.field794.method2038(0, arg1);
            }
            class251 var5 = this.field795;
            synchronized (this.field795) {
                this.field795.method2038(0, arg1);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field799[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public final void method596(int arg0) {
        try {
            class251 var2 = this.field780;
            synchronized (this.field780) {
                if (arg0 != -1) {
                    this.method594((byte) 116);
                }
                this.field780.method2043(false);
            }
            field783++;
            class251 var3 = this.field794;
            synchronized (this.field794) {
                this.field794.method2043(false);
            }
            class251 var4 = this.field795;
            synchronized (this.field795) {
                this.field795.method2043(false);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field799[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)V")
    public final void method597(int arg0, byte arg1) {
        try {
            field792++;
            if (arg1 < 35) {
                method593(92, 104, 17, true);
            }
            this.field797 = arg0;
            class251 var3 = this.field794;
            synchronized (this.field794) {
                this.field794.method2043(false);
            }
            class251 var4 = this.field795;
            synchronized (this.field795) {
                this.field795.method2043(false);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field799[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
    public final void method598(byte arg0) {
        try {
            class251 var2 = this.field794;
            synchronized (this.field794) {
                if (arg0 < 96) {
                    this.method596(-119);
                }
                this.field794.method2043(false);
            }
            field791++;
            class251 var3 = this.field795;
            synchronized (this.field795) {
                this.field795.method2043(false);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field799[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)V")
    public final void method599(int arg0, boolean arg1) {
        try {
            field786++;
            if (this.field789 != arg1) {
                if (arg0 != 50) {
                    this.method596(-88);
                }
                this.field789 = arg1;
                this.method596(-1);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field799[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)Lqca;")
    public final class134 method600(int arg0, int arg1) {
        try {
            if (arg0 > -32) {
                this.method595(46, 113);
            }
            field781++;
            class251 var3 = this.field780;
            class134 var4;
            synchronized (this.field780) {
                var4 = (class134) this.field780.method2053(0, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field793;
            byte[] var6;
            synchronized (this.field793) {
                var6 = this.field793.method512(class27.method307(127, arg1), class710.method5078(arg1, false), (byte) -76);
            }
            class134 var7 = new class134();
            var7.field1713 = arg1;
            var7.field1714 = this;
            var7.field1712 = (String[]) this.field796.clone();
            if (var6 != null) {
                var7.method1174(new class711(var6), (byte) -54);
            }
            var7.method1170((byte) -125);
            class251 var8 = this.field780;
            synchronized (this.field780) {
                this.field780.method2051((long) arg1, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field799[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lfs;IZLlga;Llga;)V")
    public class56(class796 arg0, int arg1, boolean arg2, class47 arg3, class47 arg4) {
        try {
            this.field787 = arg4;
            this.field790 = arg0;
            this.field793 = arg3;
            this.field782 = arg1;
            this.field789 = arg2;
            if (this.field793 != null) {
                int var6 = this.field793.method535((byte) -110) - 1;
                this.field793.method509(true, var6);
            }
            if (class378.field5530 == this.field790) {
                this.field796 = new String[] { null, null, null, null, null, class537.field7852.method4068((byte) -44, this.field782) };
            } else {
                this.field796 = new String[] { null, null, null, null, null, null };
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field799[9] + (arg0 == null ? field799[11] : field799[10]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field799[11] : field799[10]) + ',' + (arg4 == null ? field799[11] : field799[10]) + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method601(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method602(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method603(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
