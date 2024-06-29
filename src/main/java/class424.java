import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class424 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lvg;")
    public static class622 field6212 = new class622(40, 12);

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)I", line = 3)
    public static final int method2558(byte arg0) {
        field6213++;
        if (arg0 != 29) {
            method2559((byte) 74);
        }
        if (class468.field6730 == 0) {
            class541.field7996.method3178(new class164("jaclib"), true);
            if (class541.field7996.method3182(-1).method360((byte) 84) != 100) {
                return 1;
            }
            if (!((class164) class541.field7996.method3182(-1)).method1154(false)) {
                class420.field6187.method1660(-122);
            }
            class468.field6730 = 1;
        }
        if (class468.field6730 == 1) {
            class203.field2764 = class541.method3180(-1);
            class541.field7995.method3178(new class57(class259.field3360), true);
            class541.field7997.method3178(new class164("jaggl"), true);
            class541.field7998.method3178(new class164("jagdx"), true);
            class541.field7999.method3178(new class164("jagmisc"), true);
            class541.field8000.method3178(new class164("sw3d"), true);
            class541.field8001.method3178(new class164("hw3d"), true);
            class541.field8002.method3178(new class57(class466.field6715), true);
            class541.field8003.method3178(new class57(class683.field9637), true);
            class541.field8004.method3178(new class57(class223.field2947), true);
            class541.field8005.method3178(new class57(class554.field8140), true);
            class541.field8006.method3178(new class57(class654.field9365), true);
            class541.field8007.method3178(new class57(class425.field6216), true);
            class541.field8008.method3178(new class57(class394.field5968), true);
            class541.field8009.method3178(new class57(class224.field2958), true);
            class541.field8010.method3178(new class57(class56.field878), true);
            class541.field8011.method3178(new class57(class49.field777), true);
            class541.field8012.method3178(new class57(class537.field7867), true);
            class541.field8013.method3178(new class57(class51.field797), true);
            class541.field8014.method3178(new class57(class583.field8473), true);
            class541.field8015.method3178(new class57(class280.field3711), true);
            class541.field8016.method3178(new class221(class288.field4178, "huffman"), true);
            class541.field8017.method3178(new class57(class97.field1483), true);
            class541.field8018.method3178(new class57(class587.field8518), true);
            class541.field8019.method3178(new class57(class283.field3785), true);
            class541.field8020.method3178(new class174(class326.field4732, "details"), true);
            for (int var1 = 0; var1 < class203.field2764.length; var1++) {
                if (class203.field2764[var1].method3182(-1) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class541[] var3 = class203.field2764;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class541 var5 = var3[var4];
                int var6 = var5.method3176(1);
                int var7 = var5.method3182(-1).method360((byte) 84);
                var2 += var6 * var7 / 100;
            }
            class588.field8522 = var2;
            class468.field6730 = 2;
        }
        if (class203.field2764 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class541[] var11 = class203.field2764;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class541 var16 = var11[var12];
            int var17 = var16.method3176(1);
            int var18 = var16.method3182(-1).method360((byte) 84);
            var8 += var17;
            if (var18 < 100) {
                var10 = false;
            }
            var9 += var17 * var18 / 100;
        }
        if (var10) {
            if (!((class164) class541.field7999.method3182(-1)).method1154(false)) {
                class420.field6187.method1668(0);
            }
            class203.field2764 = null;
        }
        int var13 = var9 - class588.field8522;
        int var14 = var8 - class588.field8522;
        int var15 = var14 <= 0 ? 100 : var13 * 100 / var14;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V", line = 155)
    public static void method2559(byte arg0) {
        if (arg0 == -90) {
            field6212 = null;
        }
    }
}
