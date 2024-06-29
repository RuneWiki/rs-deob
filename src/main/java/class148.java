import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class148 {

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field1815 = 0;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lwq;")
    public static class92 field1805 = new class92();

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Lon;")
    public static class184 field1821 = null;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public int field1806;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public int field1810;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public int field1813;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public int field1817;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Ljj;")
    public static class60 field1820;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "[B")
    public byte[] field1808;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "[B")
    public byte[] field1814;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method894(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1819++;
        if (class98.method545(arg0, (byte) 11)) {
            if (arg2 != -31574) {
                method896(false, (class412) null, (byte) -113, 4, -35, -76);
            }
            client.method1117(class98.field1194[arg0], -1, arg8, arg7, arg4, arg1, arg9, arg5, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IC)Z")
    public static final boolean method895(int arg0, char arg1) {
        field1807++;
        if (arg0 <= 113) {
            method897(-48, (class327) null);
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLkb;BIII)V")
    public static final void method896(boolean arg0, class412 arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1816++;
        if (class229.field3247 >= 50 || arg1 == null || arg1.field5907 == null || arg4 >= arg1.field5907.length || arg1.field5907[arg4] == null) {
            return;
        }
        int var6 = arg1.field5907[arg4][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0xF6) >> 5;
        int var9 = var6 & 0x1F;
        if (arg1.field5907[arg4].length > 1) {
            int var10 = (int) (Math.random() * (double) arg1.field5907[arg4].length);
            if (var10 > 0) {
                var7 = arg1.field5907[arg4][var10];
            }
        }
        if (var9 == 0) {
            if (arg0) {
                class122.method776(var7, (byte) -88, 255, var8, 0);
            }
        } else if (class355.field4999 != 0) {
            class418.field5981[class229.field3247] = var7;
            class229.field3234[class229.field3247] = var8;
            class55.field657[class229.field3247] = 0;
            class225.field3161[class229.field3247] = null;
            class276.field3916[class229.field3247] = 255;
            if (arg2 >= 100) {
                int var11 = (arg3 - 64) / 128;
                int var12 = (arg5 - 64) / 128;
                class200.field2857[class229.field3247] = (var12 << 8) + ((var11 << 16) + var9);
                class229.field3247++;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILgh;)V")
    public static final void method897(int arg0, class327 arg1) {
        class161.field2122[arg0] = arg1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public static void method898(boolean arg0) {
        field1821 = null;
        field1820 = null;
        if (!arg0) {
            field1805 = null;
        }
    }
}
