import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class186 {

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public int field2864 = 1;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "Lpu;")
    public static class179 field2856 = new class179("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!an", name = "g", descriptor = "Lpn;")
    public static class49 field2859 = new class49(47, 3);

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Ljp;")
    public static class55 field2861 = new class55(29, -1);

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field2863 = 0;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "C")
    public char field2858;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "Lum;")
    public static class83 field2862;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lfh;I)V")
    public final void method1295(class194 arg0, int arg1) {
        field2855++;
        if (arg1 != 29) {
            method1296(-10, 49);
        }
        while (true) {
            int var3 = arg0.method1337((byte) -113);
            if (var3 == 0) {
                return;
            }
            this.method1299(var3, arg0, 120);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)Z")
    public static final boolean method1296(int arg0, int arg1) {
        field2853++;
        class422.field6196 = arg1 + 1 & 0xFFFF;
        if (arg0 != 0) {
            field2856 = null;
        }
        class415.field6102 = true;
        return true;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I[Lfi;I)V")
    public static final void method1297(int arg0, class38[] arg1, int arg2) {
        if (arg0 != -1) {
            method1296(-14, -14);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class38 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field503 == 0) {
                    if (var4.field610 != null) {
                        method1297(-1, var4.field610, arg2);
                    }
                    class295 var5 = (class295) class215.field3248.method358((byte) 54, (long) var4.field580);
                    if (var5 != null) {
                        class306.method2022(var5.field4546, arg2, (byte) 116);
                    }
                }
                if (arg2 == 0 && var4.field636 != null) {
                    class510 var6 = new class510();
                    var6.field7423 = var4;
                    var6.field7413 = var4.field636;
                    class152.method1090(var6);
                }
                if (arg2 == 1 && var4.field550 != null) {
                    if (var4.field607 >= 0) {
                        class38 var7 = class159.method1143(arg0 ^ 0x154AD5CF, var4.field580);
                        if (var7 == null || var7.field610 == null || var4.field607 >= var7.field610.length || var7.field610[var4.field607] != var4) {
                            continue;
                        }
                    }
                    class510 var8 = new class510();
                    var8.field7423 = var4;
                    var8.field7413 = var4.field550;
                    class152.method1090(var8);
                }
            }
        }
        field2854++;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
    public static void method1298(byte arg0) {
        field2859 = null;
        field2861 = null;
        if (arg0 < -87) {
            field2856 = null;
            field2862 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILfh;I)V")
    private final void method1299(int arg0, class194 arg1, int arg2) {
        if (arg2 < 117) {
            method1296(73, 91);
        }
        if (arg0 == 1) {
            this.field2858 = class515.method3052((byte) -81, arg1.method1398(25));
        } else if (arg0 == 2) {
            this.field2864 = 0;
        }
        field2857++;
    }
}
