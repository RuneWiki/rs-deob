import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class110 extends class101 {

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "[Lrh;")
    public class110[] field1703;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "Z")
    public boolean field1705;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public int field1702;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "Lqj;")
    public class214 field1701;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "Ljh;")
    public class66 field1695;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "[I")
    public static int[] field1692;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "[[S")
    public static short[][] field1706;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V", line = 4)
    public static void method763(int arg0) {
        field1692 = null;
        field1706 = (short[][]) null;
        int var1 = -116 % ((arg0 - 81) / 38);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I", line = 16)
    public int[] method46(int arg0, int arg1) {
        field1688++;
        if (arg0 != 1) {
            this.field1702 = -126;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)[[I", line = 27)
    public int[][] method445(int arg0, boolean arg1) {
        field1693++;
        if (arg1) {
            this.method47(-97);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZI)[I", line = 44)
    public final int[] method764(int arg0, boolean arg1, int arg2) {
        field1698++;
        if (!arg1) {
            this.field1703 = (class110[]) null;
        }
        return this.field1703[arg0].field1705 ? this.field1703[arg0].method46(1, arg2) : this.field1703[arg0].method445(arg2, false)[0];
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V", line = 65)
    public final void method765(int arg0, int arg1, int arg2) {
        field1696++;
        if (arg2 != 288) {
            this.method47(60);
        }
        int var4 = this.field1702 == 255 ? arg0 : this.field1702;
        if (this.field1705) {
            this.field1695 = new class66(var4, arg0, arg1);
        } else {
            this.field1701 = new class214(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)I", line = 89)
    public int method766(int arg0) {
        field1700++;
        if (arg0 != 32224) {
            field1697 = -67;
        }
        return -1;
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)I", line = 100)
    public int method767(int arg0) {
        field1690++;
        if (arg0 != 0) {
            this.field1701 = (class214) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V", line = 111)
    public void method47(int arg0) {
        field1691++;
        if (arg0 != -9) {
            field1697 = 63;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILre;I)V", line = 135)
    public void method44(int arg0, class263 arg1, int arg2) {
        field1687++;
        if (arg2 > -37) {
            this.field1702 = -70;
        }
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)V", line = 145)
    public void method768(int arg0) {
        field1689++;
        if (this.field1705) {
            this.field1695.method441(0);
            this.field1695 = null;
        } else {
            this.field1701.method1480((byte) -102);
            this.field1701 = null;
        }
        if (arg0 != -3321) {
            this.method46(-128, 16);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V", line = 174)
    public static final void method769(int arg0, int arg1) {
        class190.field2829--;
        field1694++;
        if (class190.field2829 == arg0) {
            return;
        }
        class85.method593(class307.field4677, arg0 + 1, class307.field4677, arg0, class190.field2829 - arg0);
        class85.method593(class180.field2686, arg0 + 1, class180.field2686, arg0, class190.field2829 - arg0);
        class85.method594(class155.field2322, arg0 + 1, class155.field2322, arg0, class190.field2829 - arg0);
        if (arg1 < 21) {
            field1692 = (int[]) null;
        }
        class85.method591(class201.field2998, arg0 + 1, class201.field2998, arg0, class190.field2829 - arg0);
        class85.method595(class13.field153, arg0 + 1, class13.field153, arg0, class190.field2829 - arg0);
        class85.method594(class193.field2893, arg0 + 1, class193.field2893, arg0, class190.field2829 - arg0);
        class85.method594(class178.field2633, arg0 + 1, class178.field2633, arg0, class190.field2829 - arg0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBI)[[I", line = 198)
    public final int[][] method770(int arg0, byte arg1, int arg2) {
        if (arg1 < 34) {
            return (int[][]) ((int[][]) null);
        }
        field1704++;
        if (!this.field1703[arg2].field1705) {
            return this.field1703[arg2].method445(arg0, false);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field1703[arg2].method46(1, arg0);
        var4[0] = var5;
        var4[2] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([Ljava/lang/String;I[S)V", line = 235)
    public static final void method771(String[] arg0, int arg1, short[] arg2) {
        class285.method1985(arg2, -14393, arg0, 0, arg0.length - 1);
        field1699++;
        if (arg1 < 81) {
            method771((String[]) null, 3, (short[]) null);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IZ)V", line = 244)
    public class110(int arg0, boolean arg1) {
        this.field1703 = new class110[arg0];
        this.field1705 = arg1;
    }
}
