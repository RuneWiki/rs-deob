import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class37 extends class13 {

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Lpg;")
    public class141 field771 = new class141();

    @OriginalMember(owner = "client!e", name = "L", descriptor = "Lha;")
    public class64 field786 = new class64();

    @OriginalMember(owner = "client!e", name = "x", descriptor = "Lhd;")
    private class67 field772;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "Lea;")
    public static class38 field779 = class9.method46((byte) 113, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field776 = -1;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "Lea;")
    private static class38 field775 = class9.method46((byte) 122, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!e", name = "G", descriptor = "Lea;")
    public static class38 field781 = class9.method46((byte) 124, ": ");

    @OriginalMember(owner = "client!e", name = "I", descriptor = "Z")
    public static boolean field783 = false;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field784 = 0;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "Lea;")
    public static class38 field782 = field775;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()Lbc;")
    public final class13 method73() {
        field773++;
        class74 var1;
        do {
            var1 = (class74) this.field771.method1027((byte) 105);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1800 == null);
        return var1.field1800;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB[IIILib;)V")
    private final void method241(int arg0, byte arg1, int[] arg2, int arg3, int arg4, class74 arg5) {
        int var7 = -71 / ((-arg1 - 63) / 40);
        if ((this.field772.field1687[arg5.field1794] & 0x4) != 0 && arg5.field1804 < 0) {
            int var8 = this.field772.field1644[arg5.field1794] / class87.field2030;
            while (true) {
                int var9 = (var8 + 1048575 - arg5.field1818) / var8;
                if (var9 > arg0) {
                    arg5.field1818 += arg0 * var8;
                    break;
                }
                arg0 -= var9;
                arg5.field1800.method72(arg2, arg3, var9);
                int var10 = class87.field2030 / 100;
                arg5.field1818 += var8 * var9 - 1048576;
                class76 var11 = arg5.field1800;
                arg3 += var9;
                int var12 = 262144 / var8;
                if (var12 < var10) {
                    var10 = var12;
                }
                if (this.field772.field1689[arg5.field1794] == 0) {
                    arg5.field1800 = class76.method598(arg5.field1814, var11.method627(), var11.method624(), var11.method632());
                } else {
                    arg5.field1800 = class76.method598(arg5.field1814, var11.method627(), 0, var11.method632());
                    this.field772.method526(arg5.field1807.field2590[arg5.field1815] < 0, true, arg5);
                    arg5.field1800.method608(var10, var11.method624());
                }
                if (arg5.field1807.field2590[arg5.field1815] < 0) {
                    arg5.field1800.method636(-1);
                }
                var11.method607(var10);
                var11.method72(arg2, arg3, arg4 - arg3);
                if (var11.method613()) {
                    this.field786.method450(var11);
                }
            }
        }
        arg5.field1800.method72(arg2, arg3, arg0);
        field768++;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public final void method75(int arg0) {
        this.field786.method75(arg0);
        for (class74 var2 = (class74) this.field771.method1020(0); var2 != null; var2 = (class74) this.field771.method1027((byte) 78)) {
            if (!this.field772.method528(1609320623, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1798) {
                        this.method243(-97, var2, var3);
                        var2.field1798 -= var3;
                        break;
                    }
                    this.method243(-125, var2, var2.field1798);
                    var3 -= var2.field1798;
                } while (!this.field772.method535(null, (byte) 35, 0, var2, var3));
            }
        }
        field777++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([III)V")
    public final void method72(int[] arg0, int arg1, int arg2) {
        field769++;
        this.field786.method72(arg0, arg1, arg2);
        for (class74 var4 = (class74) this.field771.method1020(0); var4 != null; var4 = (class74) this.field771.method1027((byte) 107)) {
            if (!this.field772.method528(1609320623, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1798) {
                        this.method241(var6, (byte) -127, arg0, var5, var5 + var6, var4);
                        var4.field1798 -= var6;
                        break;
                    }
                    this.method241(var4.field1798, (byte) 24, arg0, var5, var5 + var6, var4);
                    var5 += var4.field1798;
                    var6 -= var4.field1798;
                } while (!this.field772.method535(arg0, (byte) 92, var5, var4, var6));
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
    public static void method242(int arg0) {
        if (arg0 == -26088) {
            field779 = null;
            field782 = null;
            field775 = null;
            field781 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILib;I)V")
    private final void method243(int arg0, class74 arg1, int arg2) {
        if ((this.field772.field1687[arg1.field1794] & 0x4) != 0 && arg1.field1804 < 0) {
            int var4 = this.field772.field1644[arg1.field1794] / class87.field2030;
            int var5 = (var4 + 1048575 - arg1.field1818) / var4;
            arg1.field1818 = arg2 * var4 + arg1.field1818 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field772.field1689[arg1.field1794] == 0) {
                    arg1.field1800 = class76.method598(arg1.field1814, arg1.field1800.method627(), arg1.field1800.method624(), arg1.field1800.method632());
                } else {
                    arg1.field1800 = class76.method598(arg1.field1814, arg1.field1800.method627(), 0, arg1.field1800.method632());
                    this.field772.method526(arg1.field1807.field2590[arg1.field1815] < 0, true, arg1);
                }
                if (arg1.field1807.field2590[arg1.field1815] < 0) {
                    arg1.field1800.method636(-1);
                }
                arg2 = arg1.field1818 / var4;
            }
        }
        arg1.field1800.method75(arg2);
        field767++;
        if (arg0 >= -63) {
            this.method72(null, 106, -112);
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
    public static final void method244(int arg0) {
        if (class155.field3213 != null) {
            class22 var1 = class155.field3213;
            synchronized (class155.field3213) {
                class155.field3213 = null;
            }
        }
        int var2 = -92 % ((arg0 + 45) / 49);
        field774++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method245(int arg0, Component arg1) {
        arg1.removeKeyListener(class94.field2113);
        field778++;
        arg1.removeFocusListener(class94.field2113);
        class29.field585 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static final void method246(byte arg0) {
        if (arg0 <= -80) {
            class42.field922 = null;
            class205.field4044 = null;
            class202.field3984 = null;
            field785++;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()Lbc;")
    public final class13 method77() {
        field770++;
        class74 var1 = (class74) this.field771.method1020(0);
        if (var1 == null) {
            return null;
        } else if (var1.field1800 == null) {
            return this.method73();
        } else {
            return var1.field1800;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lhd;)V")
    public class37(class67 arg0) {
        this.field772 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()I")
    public final int method71() {
        field780++;
        return 0;
    }
}
