import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class269 {

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    private int field4807 = 0;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "[Lkh;")
    public class12[] field4791;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public int field4798;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Lvf;")
    public static class265 field4792 = class87.method582(-46, "<col=ffffff>");

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field4786 = 7759444;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "Lbk;")
    public static class52 field4800 = new class52();

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "Lvf;")
    public static class265 field4809 = class87.method582(-46, "Textures charg-Bes");

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "Lvf;")
    public static class265 field4811 = class87.method582(-46, " loggt sich ein)3");

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "J")
    private long field4797;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "Lkh;")
    private class12 field4804;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "Lkh;")
    private class12 field4812;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "[I")
    public static int[] field4810;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(JLkh;B)V")
    public final void method1838(long arg0, class12 arg1, byte arg2) {
        if (arg2 != 8) {
            return;
        }
        if (arg1.field394 != null) {
            arg1.method97(arg2 + 150);
        }
        field4803++;
        class12 var5 = this.field4791[(int) ((long) (this.field4798 - 1) & arg0)];
        arg1.field394 = var5.field394;
        arg1.field393 = arg0;
        arg1.field388 = var5;
        arg1.field394.field388 = arg1;
        arg1.field388.field394 = arg1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I")
    public final int method1839(byte arg0) {
        if (arg0 < 118) {
            field4786 = -49;
        }
        field4802++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4798; var3++) {
            class12 var4 = this.field4791[var3];
            class12 var5 = var4.field388;
            while (var4 != var5) {
                var5 = var5.field388;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static final void method1840(byte arg0) {
        class232.field4095++;
        field4805++;
        class55.field1133.method1863(true, 157);
        if (arg0 != -26) {
            field4800 = null;
        }
        class55.field1133.method911(0, 0L);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)I")
    public final int method1841(boolean arg0) {
        if (arg0) {
            field4811 = null;
        }
        field4799++;
        return this.field4798;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IJ)Lkh;")
    public final class12 method1842(int arg0, long arg1) {
        field4788++;
        this.field4797 = arg1;
        class12 var4 = this.field4791[(int) (arg1 & (long) (this.field4798 + arg0))];
        for (this.field4804 = var4.field388; this.field4804 != var4; this.field4804 = this.field4804.field388) {
            if (this.field4804.field393 == arg1) {
                class12 var5 = this.field4804;
                this.field4804 = this.field4804.field388;
                return var5;
            }
        }
        this.field4804 = null;
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
    public static final void method1843(int arg0, int arg1) {
        if (arg1 != 25245) {
            field4811 = null;
        }
        class219 var2 = class232.field4089;
        synchronized (class232.field4089) {
            class208.field3748 = arg0;
        }
        field4808++;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V")
    public final void method1844(byte arg0) {
        field4793++;
        int var2 = 0;
        if (arg0 >= -108) {
            method1848((byte) 8);
        }
        while (var2 < this.field4798) {
            class12 var3 = this.field4791[var2];
            while (true) {
                class12 var4 = var3.field388;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method97(158);
            }
        }
        this.field4804 = null;
        this.field4812 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static final void method1845(int arg0) {
        class213.field3820.method1888((byte) 106);
        if (arg0 != 21707) {
            method1852(2, (byte) -118, 59);
        }
        field4806++;
        class70.field1357.method1888((byte) 100);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public static final void method1846(int arg0) {
        field4787++;
        if (class283.field4985 == 0) {
            return;
        }
        try {
            if (++class221.field3967 > 1500) {
                if (class197.field3520 != null) {
                    class197.field3520.method990(4);
                    class197.field3520 = null;
                }
                if (class142.field2632 >= 1) {
                    class102.field1798 = -5;
                    class283.field4985 = 0;
                    return;
                }
                class283.field4985 = 1;
                class142.field2632++;
                class221.field3967 = 0;
                if (class265.field4613 == class126.field2263) {
                    class265.field4613 = class217.field3914;
                } else {
                    class265.field4613 = class126.field2263;
                }
            }
            if (class283.field4985 == 1) {
                class278.field4913 = class281.field4957.method1533(0, class82.field1549, class265.field4613);
                class283.field4985 = 2;
            }
            if (class283.field4985 == 2) {
                if (class278.field4913.field1996 == 2) {
                    throw new IOException();
                }
                if (class278.field4913.field1996 != 1) {
                    return;
                }
                class197.field3520 = new class143((Socket) class278.field4913.field1997, class281.field4957);
                class278.field4913 = null;
                class197.field3520.method982(0, true, class55.field1133.field2483, class55.field1133.field2449);
                if (class238.field4145 != null) {
                    class238.field4145.method675(0);
                }
                if (class30.field774 != null) {
                    class30.field774.method675(0);
                }
                int var1 = class197.field3520.method985((byte) 70);
                if (class238.field4145 != null) {
                    class238.field4145.method675(0);
                }
                if (class30.field774 != null) {
                    class30.field774.method675(0);
                }
                if (var1 != 101) {
                    class283.field4985 = 0;
                    class102.field1798 = var1;
                    class197.field3520.method990(4);
                    class197.field3520 = null;
                    return;
                }
                class283.field4985 = 3;
            }
            if (arg0 > -49) {
                field4796 = -76;
            }
            if (class283.field4985 == 3 && class197.field3520.method987((byte) 53) >= 2) {
                int var2 = class197.field3520.method985((byte) 70) << 8 | class197.field3520.method985((byte) 70);
                class182.method1215((byte) -123, var2);
                if (class206.field3700 == -1) {
                    class102.field1798 = 6;
                    class283.field4985 = 0;
                    class197.field3520.method990(4);
                    class197.field3520 = null;
                } else {
                    class283.field4985 = 0;
                    class197.field3520.method990(4);
                    class197.field3520 = null;
                    class229.method1551(0);
                }
            }
        } catch (IOException var3) {
            if (class197.field3520 != null) {
                class197.field3520.method990(4);
                class197.field3520 = null;
            }
            if (class142.field2632 >= 1) {
                class102.field1798 = -4;
                class283.field4985 = 0;
            } else {
                if (class265.field4613 == class126.field2263) {
                    class265.field4613 = class217.field3914;
                } else {
                    class265.field4613 = class126.field2263;
                }
                class283.field4985 = 1;
                class221.field3967 = 0;
                class142.field2632++;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Z)Lkh;")
    public final class12 method1847(boolean arg0) {
        field4795++;
        if (this.field4807 > 0 && this.field4791[this.field4807 - 1] != this.field4812) {
            class12 var2 = this.field4812;
            this.field4812 = var2.field388;
            return var2;
        }
        if (arg0) {
            this.field4807 = -110;
        }
        while (this.field4807 < this.field4798) {
            class12 var3 = this.field4791[this.field4807++].field388;
            if (this.field4791[this.field4807 - 1] != var3) {
                this.field4812 = var3.field388;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)[Lka;")
    public static final class160[] method1848(byte arg0) {
        field4794++;
        class160[] var1 = new class160[class43.field958];
        if (arg0 >= -22) {
            return null;
        }
        for (int var2 = 0; var2 < class43.field958; var2++) {
            var1[var2] = new class34(class203.field3643, class14.field429, class207.field3737[var2], field4810[var2], class190.field3417[var2], class6.field127[var2], class6.field230[var2], class268.field4715);
        }
        class261.method1739(26);
        return var1;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public static void method1849(int arg0) {
        field4792 = null;
        field4810 = null;
        field4800 = null;
        field4811 = null;
        if (arg0 == 0) {
            field4809 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)Lkh;")
    public final class12 method1850(int arg0) {
        field4801++;
        if (this.field4804 == null) {
            return null;
        }
        class12 var2 = this.field4791[(int) ((long) (this.field4798 - 1) & this.field4797)];
        if (arg0 != 157) {
            field4810 = null;
        }
        while (this.field4804 != var2) {
            if (this.field4804.field393 == this.field4797) {
                class12 var3 = this.field4804;
                this.field4804 = this.field4804.field388;
                return var3;
            }
            this.field4804 = this.field4804.field388;
        }
        this.field4804 = null;
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
    public class269(int arg0) {
        this.field4791 = new class12[arg0];
        this.field4798 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class12 var3 = this.field4791[var2] = new class12();
            var3.field394 = var3;
            var3.field388 = var3;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(Z)Lkh;")
    public final class12 method1851(boolean arg0) {
        if (arg0) {
            field4811 = null;
        }
        this.field4807 = 0;
        field4789++;
        return this.method1847(false);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)I")
    public static final int method1852(int arg0, byte arg1, int arg2) {
        if (arg1 != 72) {
            field4800 = null;
        }
        int var3 = arg2 >>> 31;
        field4790++;
        return (arg2 + var3) / arg0 - var3;
    }
}
