import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class262 extends class298 {

    @OriginalMember(owner = "client!lt", name = "P", descriptor = "Z")
    private boolean field3769 = true;

    @OriginalMember(owner = "client!lt", name = "Q", descriptor = "I")
    private int field3770 = 4096;

    @OriginalMember(owner = "client!lt", name = "M", descriptor = "I")
    public static int field3766 = 2;

    @OriginalMember(owner = "client!lt", name = "K", descriptor = "Lec;")
    public static class40 field3765 = new class40("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!lt", name = "R", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3771 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!lt", name = "T", descriptor = "Z")
    public static boolean field3773 = false;

    @OriginalMember(owner = "client!lt", name = "U", descriptor = "I")
    public static int field3774 = 0;

    @OriginalMember(owner = "client!lt", name = "V", descriptor = "[S")
    public static short[] field3775 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!lt", name = "S", descriptor = "Lci;")
    public static class421 field3772 = new class421("stellardawn", 1);

    @OriginalMember(owner = "client!lt", name = "W", descriptor = "Lec;")
    public static class40 field3776 = new class40("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!lt", name = "N", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!lt", name = "O", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)V")
    public static void method1601(int arg0) {
        field3776 = null;
        field3775 = null;
        field3772 = null;
        field3765 = null;
        field3771 = null;
        if (arg0 > -4) {
            field3765 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V")
    public class262() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)[[I")
    public final int[][] method157(int arg0, int arg1) {
        ++field3768;
        int[][] var3 = super.field4454.method1638((byte) 20, arg1);
        if (super.field4454.field3886) {
            int[] var4 = this.method1882(0, -2594, arg1 + -1 & class208.field2886);
            int[] var5 = this.method1882(0, -2594, arg1);
            int[] var6 = this.method1882(0, -2594, class208.field2886 & arg1 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class158.field1877 > var10; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field3770;
                int var12 = (var5[var10 + 1 & class474.field6656] + -var5[var10 + -1 & class474.field6656]) * this.field3770;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - -4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                } else {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                }
                if (this.field3769) {
                    var20 = 2048 - -(var20 >> 1);
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        if (arg0 != -24032) {
            field3771 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field3767;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field3769 = arg2.method895((byte) -80) == 1;
            }
        } else {
            this.field3770 = arg2.method916(21933);
        }
        if (arg0 >= -44) {
            field3774 = -53;
        }
    }
}
