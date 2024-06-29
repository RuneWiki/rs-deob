import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class59 {

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "Lac;")
    private class376 field677 = new class376();

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "Lsl;")
    public static class318 field681 = new class318(38, 8);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "Lgt;")
    public static class316 field685;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "Lac;")
    private class376 field684;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static void method533(int arg0) {
        if (arg0 > -90) {
            method538(false);
        }
        field685 = null;
        field681 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)V")
    public static final void method534(int arg0, boolean arg1) {
        if (arg1) {
            field674++;
            class215 var2 = class171.method1208(arg0, (byte) 122, 4);
            var2.method1469((byte) -110);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
    public final void method535(byte arg0) {
        while (true) {
            class376 var2 = this.field677.field5564;
            if (this.field677 == var2) {
                int var3 = 110 / ((arg0 - 27) / 52);
                field683++;
                this.field684 = null;
                return;
            }
            var2.method2307((byte) -123);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILac;)V")
    public final void method536(int arg0, class376 arg1) {
        field676++;
        if (arg1.field5565 != null) {
            arg1.method2307((byte) -128);
        }
        arg1.field5564 = this.field677;
        arg1.field5565 = this.field677.field5565;
        arg1.field5565.field5564 = arg1;
        arg1.field5564.field5565 = arg1;
        int var3 = 114 / ((-arg0 - 67) / 47);
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)Lac;")
    public final class376 method537(byte arg0) {
        field682++;
        if (arg0 != 87) {
            field685 = null;
        }
        class376 var2 = this.field677.field5564;
        if (this.field677 == var2) {
            this.field684 = null;
            return null;
        } else {
            this.field684 = var2.field5564;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V")
    public static final void method538(boolean arg0) {
        field679++;
        if (class72.field989 == 0) {
            return;
        }
        try {
            if (++class175.field2485 > 2000) {
                if (class383.field5635 != null) {
                    class383.field5635.method646(false);
                    class383.field5635 = null;
                }
                if (class4.field62 >= 1) {
                    class72.field989 = 0;
                    class247.field3669 = -5;
                    return;
                }
                class72.field989 = 1;
                class175.field2485 = 0;
                if (class310.field4422 == class291.field4193) {
                    class291.field4193 = class69.field883;
                } else {
                    class291.field4193 = class310.field4422;
                }
                class4.field62++;
            }
            if (class72.field989 == 1) {
                class262.field3853 = class498.field7404.method2551(0, class521.field7650, class291.field4193);
                class72.field989 = 2;
            }
            if (!arg0) {
                method538(false);
            }
            if (class72.field989 == 2) {
                if (class262.field3853.field6617 == 2) {
                    throw new IOException();
                }
                if (class262.field3853.field6617 != 1) {
                    return;
                }
                class383.field5635 = new class66((Socket) class262.field3853.field6613, class498.field7404);
                class262.field3853 = null;
                class383.field5635.method650(class472.field6970.field827, 0, class472.field6970.field783, 126);
                class515.method3056((byte) 83);
                int var1 = class383.field5635.method647(89);
                class515.method3056((byte) 67);
                if (var1 != 21) {
                    class247.field3669 = var1;
                    class72.field989 = 0;
                    class383.field5635.method646(!arg0);
                    class383.field5635 = null;
                    return;
                }
                class72.field989 = 3;
            }
            if (class72.field989 == 3) {
                if (class383.field5635.method641(3) < 1) {
                    return;
                }
                class498.field7402 = new String[class383.field5635.method647(122)];
                class72.field989 = 4;
            }
            if (class72.field989 == 4 && class383.field5635.method641(3) >= class498.field7402.length * 8) {
                class85.field1163.field827 = 0;
                class383.field5635.method639(0, (byte) 113, class498.field7402.length * 8, class85.field1163.field783);
                for (int var2 = 0; var2 < class498.field7402.length; var2++) {
                    class498.field7402[var2] = class199.method1403(104, class85.field1163.method588(true));
                }
                class247.field3669 = 21;
                class72.field989 = 0;
                class383.field5635.method646(false);
                class383.field5635 = null;
            }
        } catch (IOException var3) {
            if (class383.field5635 != null) {
                class383.field5635.method646(false);
                class383.field5635 = null;
            }
            if (class4.field62 >= 1) {
                class72.field989 = 0;
                class247.field3669 = -4;
            } else {
                class72.field989 = 1;
                if (class310.field4422 == class291.field4193) {
                    class291.field4193 = class69.field883;
                } else {
                    class291.field4193 = class310.field4422;
                }
                class4.field62++;
                class175.field2485 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)Lac;")
    public final class376 method539(byte arg0) {
        field675++;
        class376 var2 = this.field677.field5564;
        if (this.field677 == var2) {
            return null;
        } else {
            int var3 = -76 % ((arg0 - 2) / 56);
            var2.method2307((byte) 118);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)Lac;")
    public final class376 method540(boolean arg0) {
        field680++;
        if (!arg0) {
            return null;
        }
        class376 var2 = this.field684;
        if (this.field677 == var2) {
            this.field684 = null;
            return null;
        } else {
            this.field684 = var2.field5564;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(Z)I")
    public final int method541(boolean arg0) {
        field678++;
        if (!arg0) {
            this.field677 = null;
        }
        int var2 = 0;
        class376 var3 = this.field677.field5564;
        while (this.field677 != var3) {
            var3 = var3.field5564;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
    public class59() {
        this.field677.field5565 = this.field677;
        this.field677.field5564 = this.field677;
    }
}
