import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class552 {

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Lwg;")
    private class58 field7734 = new class58(64);

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public int field7737 = 0;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lkr;")
    private class329 field7733;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field7726;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field7731 = 0;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Ltc;")
    public static class552 field7724;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Z")
    public static boolean field7721;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[I")
    public static int[] field7723;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static final void method3095(int arg0) {
        field7725++;
        class115.field1466.method2098((byte) 122);
        class217.field2773 = null;
        class463.field6597 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method3096(String arg0, byte arg1) {
        field7736++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 <= 89) {
            field7721 = false;
        }
        while (class447.field6284 > var2) {
            if (arg0.equalsIgnoreCase(class395.field5457[var2])) {
                return true;
            }
            var2++;
        }
        return arg0.equalsIgnoreCase(class147.field1899.field257);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public final void method3097(byte arg0) {
        class58 var2 = this.field7734;
        synchronized (this.field7734) {
            this.field7734.method315(arg0 ^ 0xFFFFFFEC);
        }
        field7728++;
        if (arg0 != -19) {
            method3095(13);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method3098(int arg0, int arg1, int arg2) {
        field7735++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else {
            if (arg0 <= 69) {
                method3100(1);
            }
            if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public final void method3099(boolean arg0) {
        if (!arg0) {
            field7724 = null;
        }
        class58 var2 = this.field7734;
        synchronized (this.field7734) {
            this.field7734.method317((byte) 21);
        }
        field7722++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static void method3100(int arg0) {
        if (arg0 <= 70) {
            field7724 = null;
        }
        field7723 = null;
        field7724 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)Ljg;")
    public final class335 method3101(boolean arg0, int arg1) {
        field7727++;
        class58 var3 = this.field7734;
        class335 var4;
        synchronized (this.field7734) {
            var4 = (class335) this.field7734.method323((long) arg1, -19814);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0) {
            return null;
        } else {
            class329 var5 = this.field7733;
            byte[] var6;
            synchronized (this.field7733) {
                var6 = this.field7733.method2054(true, 4, arg1);
            }
            class335 var7 = new class335();
            var7.field4688 = this;
            var7.field4673 = arg1;
            if (var6 != null) {
                var7.method2129((byte) -44, new class551(var6));
            }
            var7.method2128((byte) -105);
            class58 var8 = this.field7734;
            synchronized (this.field7734) {
                this.field7734.method316((long) arg1, (byte) -127, var7);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
    public final void method3102(int arg0, int arg1) {
        if (arg1 != 20302) {
            return;
        }
        class58 var3 = this.field7734;
        synchronized (this.field7734) {
            this.field7734.method320(arg0, -306674912);
        }
        field7732++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method3103(int arg0, String arg1) throws ClassNotFoundException {
        field7729++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else {
            if (arg0 != 0) {
                method3104(-51);
            }
            if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)[Lvw;")
    public static final class492[] method3104(int arg0) {
        field7730++;
        if (class356.field4985 == null) {
            class492[] var1 = class281.method1754(class31.field488, (byte) -70);
            class492[] var2 = new class492[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class492 var8 = var1[var4];
                if ((var8.field6873 <= 0 || var8.field6873 >= 24) && var8.field6871 >= 800 && var8.field6870 >= 600 && (class282.field3697 >= 96 || class428.field5845 != 0 || var8.field6871 <= 1024 && var8.field6870 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class492 var10 = var2[var9];
                        if (var8.field6871 == var10.field6871 && var8.field6870 == var10.field6870) {
                            if (var8.field6873 > var10.field6873) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class356.field4985 = new class492[var3];
            class205.method1313(var2, 0, class356.field4985, 0, var3);
            int[] var5 = new int[class356.field4985.length];
            for (int var6 = 0; var6 < class356.field4985.length; var6++) {
                class492 var7 = class356.field4985[var6];
                var5[var6] = var7.field6871 * var7.field6870;
            }
            class374.method2286(class356.field4985, var5, 26881);
        }
        if (arg0 != 0) {
            field7731 = -27;
        }
        return class356.field4985;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class552(class513 arg0, int arg1, class329 arg2) {
        this.field7733 = arg2;
        this.field7726 = this.field7733.method2064(0, 4);
    }
}
