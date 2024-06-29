import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XDAGNEWI")
public class class64 {

    @OriginalMember(owner = "client!XDAGNEWI", name = "i", descriptor = "Z")
    public boolean field1673 = false;

    @OriginalMember(owner = "client!XDAGNEWI", name = "j", descriptor = "Z")
    public boolean field1674 = true;

    @OriginalMember(owner = "client!XDAGNEWI", name = "l", descriptor = "Z")
    public boolean field1676 = false;

    @OriginalMember(owner = "client!XDAGNEWI", name = "o", descriptor = "Z")
    public boolean field1679 = false;

    @OriginalMember(owner = "client!XDAGNEWI", name = "p", descriptor = "I")
    public int field1680 = -1;

    @OriginalMember(owner = "client!XDAGNEWI", name = "q", descriptor = "Z")
    public boolean field1681 = true;

    @OriginalMember(owner = "client!XDAGNEWI", name = "a", descriptor = "I")
    private static int field1665 = 6;

    @OriginalMember(owner = "client!XDAGNEWI", name = "b", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!XDAGNEWI", name = "d", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!XDAGNEWI", name = "g", descriptor = "I")
    public int field1671;

    @OriginalMember(owner = "client!XDAGNEWI", name = "h", descriptor = "I")
    public int field1672;

    @OriginalMember(owner = "client!XDAGNEWI", name = "k", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "client!XDAGNEWI", name = "m", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!XDAGNEWI", name = "n", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!XDAGNEWI", name = "f", descriptor = "Ljava/lang/String;")
    public String field1670;

    @OriginalMember(owner = "client!XDAGNEWI", name = "e", descriptor = "[I")
    public static int[] field1669;

    @OriginalMember(owner = "client!XDAGNEWI", name = "c", descriptor = "[LXDAGNEWI;")
    public static class64[] field1667;

    @OriginalMember(owner = "client!XDAGNEWI", name = "a", descriptor = "(LLKPVZAQN;I)V")
    public static void method564(class33 arg0, int arg1) {
        class58 var2 = new class58((byte) -115, arg0.method323("varp.dat", null));
        field1668 = 0;
        int var3 = 52 / arg1;
        field1666 = var2.method517();
        if (field1667 == null) {
            field1667 = new class64[field1666];
        }
        if (field1669 == null) {
            field1669 = new int[field1666];
        }
        for (int var4 = 0; var4 < field1666; var4++) {
            if (field1667[var4] == null) {
                field1667[var4] = new class64();
            }
            field1667[var4].method565(var2, var4, field1665);
        }
        if (var2.field1614.length != var2.field1615) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!XDAGNEWI", name = "a", descriptor = "(LWBEWPIXO;II)V")
    public void method565(class58 arg0, int arg1, int arg2) {
        if (arg2 < 6 || arg2 > 6) {
            field1665 = -498;
        }
        while (true) {
            int var4 = arg0.method515();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1671 = arg0.method515();
            } else if (var4 == 2) {
                this.field1672 = arg0.method515();
            } else if (var4 == 3) {
                this.field1673 = true;
                field1669[field1668++] = arg1;
            } else if (var4 == 4) {
                this.field1674 = false;
            } else if (var4 == 5) {
                this.field1675 = arg0.method517();
            } else if (var4 == 6) {
                this.field1676 = true;
            } else if (var4 == 7) {
                this.field1677 = arg0.method520();
            } else if (var4 == 8) {
                this.field1678 = 1;
                this.field1679 = true;
            } else if (var4 == 10) {
                this.field1670 = arg0.method522();
            } else if (var4 == 11) {
                this.field1679 = true;
            } else if (var4 == 12) {
                this.field1680 = arg0.method520();
            } else if (var4 == 13) {
                this.field1678 = 2;
                this.field1679 = true;
            } else if (var4 == 14) {
                this.field1681 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
