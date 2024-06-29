import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class242 implements class106 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Z")
    private boolean field3613 = false;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    private int field3635 = 50;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lve;")
    private class233 field3614;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Lve;")
    private class233 field3627;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "Ljl;")
    private class231 field3632;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "Ljl;")
    private class231 field3621;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "[B")
    private byte[] field3645;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "[B")
    private byte[] field3622;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[Z")
    private boolean[] field3616;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "[Z")
    private boolean[] field3629;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "[S")
    private short[] field3620;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "[Z")
    private boolean[] field3628;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "[B")
    private byte[] field3630;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "[Z")
    private boolean[] field3631;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[B")
    private byte[] field3615;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "[Z")
    private boolean[] field3638;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Z")
    public static boolean field3626 = true;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Lqd;")
    public static class37 field3625 = new class37(4);

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "Lqd;")
    public static class37 field3640 = new class37(64);

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    public static int field3650 = 1;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "B")
    public static byte field3651;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Lve;")
    public static class233 field3648;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)I")
    public final int method700(int arg0, byte arg1) {
        field3633++;
        if (arg1 <= 15) {
            field3648 = null;
        }
        return this.field3620[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZF)[I")
    public final int[] method695(int arg0, boolean arg1, float arg2) {
        field3624++;
        class284 var4 = this.method1573(arg0, 255);
        if (var4 == null) {
            return null;
        } else {
            var4.field4525 = arg1;
            return var4.method1911(this, arg2, this.field3614, false, this.field3613 || this.field3638[arg0]);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method1571(byte arg0) {
        field3648 = null;
        field3640 = null;
        if (arg0 <= 0) {
            field3651 = 116;
        }
        field3625 = null;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(II)[I")
    public final int[] method699(int arg0, int arg1) {
        field3642++;
        class284 var3 = this.method1573(arg1, 255);
        if (arg0 != 1) {
            method1576(30, true);
        }
        return var3 == null ? null : var3.method1910(this.field3614, this.field3613 || this.field3638[arg1], false, this);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lve;B)V")
    public static final void method1572(class233 arg0, byte arg1) {
        field3639++;
        if (class192.field2752) {
            return;
        }
        class144.method952();
        if (arg1 > -94) {
            field3625 = null;
        }
        class211.field3034 = class90.method611(class171.field2455, arg0, true);
        int var2 = class250.field3813;
        int var3 = var2 * 956 / 503;
        class211.field3034.method477((class214.field3080 - var3) / 2, 0, var3, var2);
        class104.field1543 = class276.method1855(arg0, 39, class266.field4012);
        class104.field1543.method812(class214.field3080 / 2 - class104.field1543.field2499 / 2, 18);
        class192.field2752 = true;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(IB)Z")
    public final boolean method701(int arg0, byte arg1) {
        if (arg1 == 22) {
            field3634++;
            class284 var3 = this.method1573(arg0, arg1 ^ 0xE9);
            return var3 == null ? false : var3.method1914(this.field3614, this, arg1 ^ 0xFFFFFFBD);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(II)Lra;")
    private final class284 method1573(int arg0, int arg1) {
        field3641++;
        class284 var3 = (class284) this.field3632.method1501((long) arg0, (byte) 126);
        if (var3 != null) {
            return var3;
        } else if (arg1 == 255) {
            byte[] var4 = this.field3627.method1538(arg0, 0, (byte) 97);
            if (var4 == null) {
                return null;
            } else {
                class114 var5 = new class114(var4);
                class284 var6 = new class284(var5);
                this.field3632.method1499((long) arg0, -86, var6);
                return var6;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([BIII)I")
    public static final int method1574(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 255) {
            field3640 = null;
        }
        int var4 = -1;
        field3644++;
        for (int var5 = arg3; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class58.field889[(arg0[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(II)V")
    public final void method1575(int arg0, int arg1) {
        if (arg0 < 31) {
            field3625 = null;
        }
        for (class284 var3 = (class284) this.field3632.method1503(29704); var3 != null; var3 = (class284) this.field3632.method1498(90)) {
            if (var3.field4525) {
                var3.method1912(arg1, 8162);
                var3.field4525 = false;
            }
        }
        field3646++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)Z")
    public final boolean method696(int arg0, boolean arg1) {
        if (arg1) {
            field3643++;
            return this.field3616[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Z")
    public final boolean method697(int arg0, int arg1) {
        if (arg0 >= -92) {
            this.method1578(-123, false);
        }
        field3636++;
        return this.field3628[arg1];
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(IZ)V")
    public static final void method1576(int arg0, boolean arg1) {
        field3617++;
        class270.method1804(10288);
        if (class192.field2754 != 30 && class192.field2754 != 25) {
            return;
        }
        class200.field2883++;
        if (class200.field2883 < 50 && !arg1) {
            return;
        }
        class200.field2883 = arg0;
        if (!class148.field2109 && class10.field180 != null) {
            class145.field2083++;
            class95.field1451.method522(220, 28727);
            try {
                class10.field180.method356((byte) 13, class95.field1451.field1629, 0, class95.field1451.field1673);
                class95.field1451.field1673 = 0;
            } catch (IOException var2) {
                class148.field2109 = true;
            }
        }
        class270.method1804(arg0 ^ 0x2830);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)Z")
    public final boolean method698(int arg0, int arg1) {
        field3618++;
        if (arg1 != -7854) {
            this.method701(-20, (byte) -91);
        }
        return this.field3613 || this.field3638[arg0];
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public final void method1577(byte arg0) {
        field3623++;
        this.field3632.method1500(false);
        if (this.field3621 != null) {
            this.field3621.method1500(false);
        }
        if (arg0 != 82) {
            this.field3613 = true;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lve;Lve;Lve;IZ)V")
    public class242(class233 arg0, class233 arg1, class233 arg2, int arg3, boolean arg4) {
        this.field3613 = arg4;
        this.field3614 = arg2;
        this.field3635 = arg3;
        this.field3627 = arg0;
        this.field3632 = new class231(this.field3635);
        this.field3621 = null;
        class114 var6 = new class114(arg1.method1538(0, 0, (byte) 104));
        int var7 = var6.method756(-29901);
        this.field3645 = new byte[var7];
        this.field3622 = new byte[var7];
        this.field3616 = new boolean[var7];
        this.field3629 = new boolean[var7];
        this.field3620 = new short[var7];
        this.field3628 = new boolean[var7];
        this.field3630 = new byte[var7];
        this.field3631 = new boolean[var7];
        this.field3615 = new byte[var7];
        this.field3638 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field3629[var8] = var6.method760(false) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field3629[var9]) {
                this.field3616[var9] = var6.method760(false) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field3629[var10]) {
                this.field3628[var10] = var6.method760(false) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field3629[var11]) {
                this.field3638[var11] = var6.method760(false) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field3629[var12]) {
                this.field3631[var12] = var6.method760(false) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field3629[var13]) {
                this.field3622[var13] = var6.method741(3083);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field3629[var14]) {
                this.field3615[var14] = var6.method741(3083);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field3629[var15]) {
                this.field3630[var15] = var6.method741(3083);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field3629[var16]) {
                this.field3645[var16] = var6.method741(3083);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field3629[var17]) {
                this.field3620[var17] = (short) var6.method756(-29901);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(IZ)V")
    public final void method1578(int arg0, boolean arg1) {
        this.field3613 = arg1;
        this.method1577((byte) 82);
        field3647++;
        if (arg0 != 220) {
            this.field3638 = null;
        }
    }
}
