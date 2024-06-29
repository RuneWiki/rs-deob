import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public abstract class class150 {

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "Lkea;")
    public static class203 field1846;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IB)V")
    public static final void method885(int arg0, byte arg1) {
        class83.field945 = arg0;
        field1847++;
        class330.field4756 = -1;
        class590.field8474 = 100;
        class647.field9361 = 3;
        if (arg1 != 6) {
            field1846 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Loe;Z)Loe;")
    public abstract class172 method886(class172 arg0, boolean arg1);

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
    public static void method887(int arg0) {
        if (arg0 == 0) {
            field1846 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "()V")
    public static final void method888() {
        if (class326.field4699 != null) {
            for (int var0 = 0; var0 < class326.field4699.length; var0++) {
                for (int var1 = 0; var1 < class588.field8441; var1++) {
                    for (int var2 = 0; var2 < class91.field1047; var2++) {
                        if (class326.field4699[var0][var1][var2] != null) {
                            class326.field4699[var0][var1][var2].method617(-1);
                        }
                        class326.field4699[var0][var1][var2] = null;
                    }
                }
            }
        }
        class326.field4699 = null;
        class544.field7780 = null;
        if (class327.field4722 != null) {
            for (int var3 = 0; var3 < class327.field4722.length; var3++) {
                for (int var4 = 0; var4 < class588.field8441; var4++) {
                    for (int var5 = 0; var5 < class91.field1047; var5++) {
                        if (class327.field4722[var3][var4][var5] != null) {
                            class327.field4722[var3][var4][var5].method617(-1);
                        }
                        class327.field4722[var3][var4][var5] = null;
                    }
                }
            }
        }
        class327.field4722 = null;
        class492.field7164 = null;
        class431.field6408 = null;
        class435.field6449 = null;
        class126.field1564 = 0;
        if (class92.field1069 != null) {
            for (int var6 = 0; var6 < class126.field1564; var6++) {
                class92.field1069[var6] = null;
            }
        }
        if (class392.field6000 != null) {
            for (int var7 = 0; var7 < class392.field6001; var7++) {
                class392.field6000[var7] = null;
            }
            class392.field6001 = 0;
        }
        if (class48.field512 != null) {
            for (int var8 = 0; var8 < class351.field5007; var8++) {
                class48.field512[var8] = null;
            }
            for (int var9 = 0; var9 < class637.field9161; var9++) {
                for (int var10 = 0; var10 < class588.field8441; var10++) {
                    for (int var11 = 0; var11 < class91.field1047; var11++) {
                        class207.field2784[var9][var10][var11] = 0L;
                    }
                }
            }
            class351.field5007 = 0;
        }
        class326.field4697 = null;
        class165.method955(-16);
        class24.field266.method3295((byte) -99);
        class136.field1696 = null;
        client.field3599 = null;
        class184.field2290 = null;
        class453.field6777 = null;
        class59.field678 = null;
        class103.field1228 = null;
    }
}
