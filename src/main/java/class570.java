import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class570 {

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public int field7201 = 0;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "[I")
    public int[] field7204 = new int[16];

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "[[B")
    public byte[][] field7207 = new byte[6][258];

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "[[I")
    public int[][] field7194 = new int[6][258];

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "[I")
    public int[] field7208 = new int[256];

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "[[I")
    public int[][] field7205 = new int[6][258];

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "[Z")
    public boolean[] field7198 = new boolean[256];

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "[I")
    public int[] field7215 = new int[6];

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "[B")
    public byte[] field7209 = new byte[18002];

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "[B")
    public byte[] field7214 = new byte[256];

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "[B")
    public byte[] field7191 = new byte[4096];

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "[I")
    public int[] field7197 = new int[257];

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "[Z")
    public boolean[] field7196 = new boolean[16];

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "[B")
    public byte[] field7221 = new byte[18002];

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public int field7218 = 0;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "[[I")
    public int[][] field7219 = new int[6][258];

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "[Lnj;")
    public static class229[] field7216 = new class229[4];

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field7217 = -1;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Lcga;")
    public static class449 field7212 = new class449(78, 4);

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "B")
    public byte field7220;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public int field7189;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public int field7190;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public int field7192;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public int field7193;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public int field7195;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public int field7200;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public int field7206;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public int field7210;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public int field7211;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public int field7213;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public int field7222;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public int field7223;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public int field7224;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "[B")
    public byte[] field7199;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "[B")
    public byte[] field7203;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BIIII)V")
    public static final void method3021(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field7202++;
        for (class112 var5 = (class112) class578.field7755.method1909(true); var5 != null; var5 = (class112) class578.field7755.method1916((byte) 95)) {
            class304.method1809(arg3, var5, arg1, arg2, arg4, (byte) -58);
        }
        int var6 = -1 / ((-arg0 - 1) / 46);
        for (class112 var7 = (class112) class16.field163.method1909(true); var7 != null; var7 = (class112) class16.field163.method1916((byte) 125)) {
            byte var12 = 1;
            class403 var13 = var7.field1389.method209(2);
            if (var7.field1389.field488) {
                var12 = 0;
            } else if (var7.field1389.field465 == var13.field5205 || var7.field1389.field465 == var13.field5202 || var7.field1389.field465 == var13.field5189 || var7.field1389.field465 == var13.field5168) {
                var12 = 2;
            } else if (var7.field1389.field465 == var13.field5186 || var7.field1389.field465 == var13.field5204 || var7.field1389.field465 == var13.field5165 || var7.field1389.field465 == var13.field5209) {
                var12 = 3;
            }
            if (var7.field1393 != var12) {
                int var14 = class294.method1774(-122, var7.field1389);
                class689 var15 = var7.field1389.field6326;
                if (var15.field9546 != null) {
                    var15 = var15.method3812(class327.field4084, -116);
                }
                if (var15 == null || var14 == -1) {
                    var7.field1399 = -1;
                    var7.field1387 = false;
                } else if (var7.field1399 != var14 || var15.field9525 != var7.field1387) {
                    if (var7.field1396 != null) {
                        class314.field3941.method1489(var7.field1396);
                        var7.field1396 = null;
                    }
                    var7.field1390 = null;
                    var7.field1413 = null;
                    var7.field1399 = var14;
                    var7.field1387 = var15.field9525;
                }
                var7.field1393 = var12;
            }
            var7.field1398 = var7.field1389.field8018;
            var7.field1408 = var7.field1389.field8018 + (var7.field1389.method210(false) << 8);
            var7.field1409 = var7.field1389.field8011;
            var7.field1407 = var7.field1389.field8011 + (var7.field1389.method210(false) << 8);
            class304.method1809(arg3, var7, arg1, arg2, arg4, (byte) -58);
        }
        for (class112 var8 = (class112) class664.field9022.method3830((byte) -9); var8 != null; var8 = (class112) class664.field9022.method3838((byte) -92)) {
            byte var9 = 1;
            class403 var10 = var8.field1392.method209(2);
            if (var8.field1392.field488) {
                var9 = 0;
            } else if (var8.field1392.field465 == var10.field5205 || var8.field1392.field465 == var10.field5202 || var8.field1392.field465 == var10.field5189 || var8.field1392.field465 == var10.field5168) {
                var9 = 2;
            } else if (var8.field1392.field465 == var10.field5186 || var8.field1392.field465 == var10.field5204 || var8.field1392.field465 == var10.field5165 || var8.field1392.field465 == var10.field5209) {
                var9 = 3;
            }
            if (var8.field1393 != var9) {
                int var11 = class78.method610(var8.field1392, -959874180);
                if (var8.field1399 != var11 || var8.field1392.field4692 != var8.field1387) {
                    if (var8.field1396 != null) {
                        class314.field3941.method1489(var8.field1396);
                        var8.field1396 = null;
                    }
                    var8.field1399 = var11;
                    var8.field1390 = null;
                    var8.field1413 = null;
                    var8.field1387 = var8.field1392.field4692;
                }
                var8.field1393 = var9;
            }
            var8.field1398 = var8.field1392.field8018;
            var8.field1408 = var8.field1392.field8018 + (var8.field1392.method210(false) << 8);
            var8.field1409 = var8.field1392.field8011;
            var8.field1407 = var8.field1392.field8011 + (var8.field1392.method210(false) << 8);
            class304.method1809(arg3, var8, arg1, arg2, arg4, (byte) -58);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method3022(int arg0) {
        field7212 = null;
        if (arg0 > -99) {
            field7212 = null;
        }
        field7216 = null;
    }
}
