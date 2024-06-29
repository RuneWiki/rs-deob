import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class151 extends class132 {

    @OriginalMember(owner = "client!dca", name = "E", descriptor = "[I")
    public static int[] field2291 = new int[1];

    @OriginalMember(owner = "client!dca", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field2289 = new String[8];

    @OriginalMember(owner = "client!dca", name = "H", descriptor = "Lej;")
    public static class104 field2294 = new class104("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!dca", name = "J", descriptor = "F")
    public static float field2296;

    @OriginalMember(owner = "client!dca", name = "y", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!dca", name = "A", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!dca", name = "F", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!dca", name = "G", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!dca", name = "I", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!dca", name = "D", descriptor = "Ldea;")
    private class205 field2290;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method985(String arg0, int arg1, int arg2) {
        field2293++;
        if (this.field2290 == null) {
            return arg0;
        }
        if (arg1 != -22122) {
            field2291 = null;
        }
        class118 var4 = (class118) this.field2290.method1242(0, (long) arg2);
        return var4 == null ? arg0 : var4.field1939;
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(III)I")
    public final int method986(int arg0, int arg1, int arg2) {
        field2288++;
        if (arg0 >= -113) {
            field2294 = null;
        }
        if (this.field2290 == null) {
            return arg1;
        } else {
            class10 var4 = (class10) this.field2290.method1242(0, (long) arg2);
            return var4 == null ? arg1 : var4.field106;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLdaa;)V")
    public final void method987(byte arg0, class11 arg1) {
        field2287++;
        if (arg0 <= 18) {
            this.method985(null, 84, -66);
        }
        while (true) {
            int var3 = arg1.method110((byte) 88);
            if (var3 == 0) {
                return;
            }
            this.method989(arg1, var3, -2354);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
    public static void method988(byte arg0) {
        field2291 = null;
        field2289 = null;
        field2294 = null;
        if (arg0 < 18) {
            method988((byte) 63);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ldaa;II)V")
    private final void method989(class11 arg0, int arg1, int arg2) {
        field2292++;
        if (arg1 == 249) {
            int var4 = arg0.method110((byte) 48);
            if (this.field2290 == null) {
                int var5 = class32.method326(var4, false);
                this.field2290 = new class205(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method110((byte) 117) == 1;
                int var8 = arg0.method89((byte) -89);
                class176 var9;
                if (var7) {
                    var9 = new class118(arg0.method100((byte) 60));
                } else {
                    var9 = new class10(arg0.method119(-104));
                }
                this.field2290.method1241(var9, (long) var8, -112);
            }
        }
        if (arg2 != -2354) {
            field2294 = null;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lan;B)V")
    public static final void method990(class21 arg0, byte arg1) {
        field2286++;
        class491.field6877 = arg0.method252((byte) -95, "p11_full");
        class176.field2518 = arg0.method252((byte) -128, "p12_full");
        class643.field9333 = arg0.method252((byte) 44, "b12_full");
        class80.field1296 = arg0.method252((byte) -110, "hitmarks");
        class314.field4232 = arg0.method252((byte) -102, "hitbar_default");
        class590.field8433 = arg0.method252((byte) -75, "timerbar_default");
        class564.field7813 = arg0.method252((byte) 30, "headicons_pk");
        if (arg1 != -25) {
            method988((byte) -39);
        }
        class529.field7408 = arg0.method252((byte) -113, "headicons_prayer");
        class566.field7829 = arg0.method252((byte) 51, "hint_headicons");
        class124.field2034 = arg0.method252((byte) -85, "hint_mapmarkers");
        class5.field71 = arg0.method252((byte) -84, "mapflag");
        class318.field4316 = arg0.method252((byte) 71, "cross");
        class296.field4054 = arg0.method252((byte) 61, "mapdots");
        class194.field2743 = arg0.method252((byte) 123, "scrollbar");
        class348.field4672 = arg0.method252((byte) 79, "name_icons");
        class82.field1340 = arg0.method252((byte) -97, "floorshadows");
        class215.field3055 = arg0.method252((byte) -113, "compass");
        class525.field7384 = arg0.method252((byte) 76, "otherlevel");
        class67.field1138 = arg0.method252((byte) -91, "hint_mapedge");
    }
}
