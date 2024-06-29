import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class97 {

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    private int field1728 = -1;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    private int field1732 = 0;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Ljg;")
    private class303 field1733 = new class303();

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Z")
    public boolean field1736 = false;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    private int field1729;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[[I")
    private int[][] field1731;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[Lri;")
    private class68[] field1720;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field1724 = -1;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Ljf;")
    public static class229 field1723 = class212.method1457((byte) 94, "Examiner");

    @OriginalMember(owner = "client!q", name = "j", descriptor = "[F")
    public static float[] field1725 = new float[4];

    @OriginalMember(owner = "client!q", name = "l", descriptor = "F")
    public static float field1727;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "[I")
    public static int[] field1735;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "[I")
    public static int[] field1737;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[Lad;")
    public static class129[] field1716;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "[S")
    public static short[] field1726;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 11)
    public static void method663(int arg0) {
        field1735 = null;
        field1716 = null;
        if (arg0 != -14723) {
            method663(15);
        }
        field1723 = null;
        field1725 = null;
        field1737 = null;
        field1726 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[I", line = 26)
    public final int[] method664(int arg0, int arg1) {
        if (arg1 != 0) {
            return (int[]) null;
        }
        field1717++;
        if (this.field1730 == this.field1729) {
            this.field1736 = this.field1720[arg0] == null;
            this.field1720[arg0] = class261.field4532;
            return this.field1731[arg0];
        } else if (this.field1730 == 1) {
            this.field1736 = this.field1728 != arg0;
            this.field1728 = arg0;
            return this.field1731[0];
        } else {
            class68 var3 = this.field1720[arg0];
            if (var3 == null) {
                this.field1736 = true;
                if (this.field1730 > this.field1732) {
                    var3 = new class68(arg0, this.field1732);
                    this.field1732++;
                } else {
                    class68 var4 = (class68) this.field1733.method2077(-25670);
                    var3 = new class68(arg0, var4.field1302);
                    this.field1720[var4.field1303] = null;
                    var4.method1747((byte) -119);
                }
                this.field1720[arg0] = var3;
            } else {
                this.field1736 = false;
            }
            this.field1733.method2074(var3, (byte) 77);
            return this.field1731[var3.field1302];
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)I", line = 96)
    public static int method665(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)[[I", line = 119)
    public final int[][] method666(int arg0) {
        if (arg0 != 23123) {
            method663(35);
        }
        field1719++;
        if (this.field1730 != this.field1729) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1730; var2++) {
            this.field1720[var2] = class261.field4532;
        }
        return this.field1731;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(III)V", line = 192)
    public class97(int arg0, int arg1, int arg2) {
        this.field1729 = arg1;
        this.field1730 = arg0;
        this.field1731 = new int[this.field1730][arg2];
        this.field1720 = new class68[this.field1729];
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 154)
    public final void method667(int arg0) {
        int var2 = 0;
        if (arg0 != -5228) {
            return;
        }
        while (var2 < this.field1730) {
            this.field1731[var2] = null;
            var2++;
        }
        this.field1720 = null;
        this.field1731 = (int[][]) null;
        this.field1733.method2073(true);
        field1718++;
        this.field1733 = null;
    }
}
