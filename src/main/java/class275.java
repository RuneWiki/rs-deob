import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class275 {

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "B")
    public byte field4175;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
    public int field4174;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public int field4168;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public int field4169;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "Lqt;")
    public class275 field4177;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "Lsh;")
    public static class472 field4179 = new class472(71, 10);

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "J")
    public static long field4184 = -1L;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "I")
    public static int field4187 = 2;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "Lo;")
    public static class332 field4186 = new class332("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "Lo;")
    public static class332 field4189 = new class332("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public int field4167;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public int field4170;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public int field4173;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public int field4180;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
    public int field4182;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
    public int field4183;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field4188;

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "[[[J")
    public static long[][][] field4190;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V", line = 3)
    public static void method1788(byte arg0) {
        field4188 = null;
        field4179 = null;
        field4190 = null;
        field4186 = null;
        if (arg0 != 70) {
            field4184 = 26L;
        }
        field4189 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IBI)Llt;", line = 24)
    public static final class186 method1789(int arg0, byte arg1, int arg2) {
        field4171++;
        class186 var3 = (class186) class367.field5546.method2305((long) arg0 | (long) arg2 << 32, (byte) 48);
        if (arg1 != 123) {
            return null;
        }
        if (var3 == null) {
            var3 = new class186(arg2, arg0);
            class367.field5546.method2307(var3.field436, var3, (byte) 124);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIII)V", line = 50)
    public static final void method1790(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 > -19) {
            method1789(1, (byte) -43, 126);
        }
        field4176++;
        for (class43 var5 = (class43) class390.field5742.method2456(32101); var5 != null; var5 = (class43) class390.field5742.method2461(301)) {
            class370.method2293(arg3, var5, arg1, arg2, 8048, arg0);
        }
        for (class43 var6 = (class43) class131.field1825.method2456(32101); var6 != null; var6 = (class43) class131.field1825.method2461(301)) {
            byte var11 = 1;
            class322 var12 = var6.field582.method1917(0);
            if (var6.field582.field4663) {
                var11 = 0;
            } else if (var6.field582.field4620 == var12.field4806 || var6.field582.field4620 == var12.field4817 || var6.field582.field4620 == var12.field4832 || var6.field582.field4620 == var12.field4812) {
                var11 = 2;
            } else if (var6.field582.field4620 == var12.field4834 || var6.field582.field4620 == var12.field4816 || var6.field582.field4620 == var12.field4800 || var6.field582.field4620 == var12.field4825) {
                var11 = 3;
            }
            if (var6.field593 != var11) {
                int var13 = class50.method366(var6.field582, -1);
                if (var6.field589 != var13) {
                    if (var6.field580 != null) {
                        class452.field6419.method2415(var6.field580);
                        var6.field580 = null;
                    }
                    var6.field589 = var13;
                }
                var6.field593 = var11;
            }
            var6.field583 = var6.field582.field4543;
            var6.field594 = var6.field582.field4543 + var6.field582.method1705((byte) 65) * 64;
            var6.field585 = var6.field582.field4538;
            var6.field577 = var6.field582.field4538 + var6.field582.method1705((byte) 65) * 64;
            class370.method2293(arg3, var6, arg1, arg2, 8048, arg0);
        }
        for (class43 var7 = (class43) class4.field82.method2296((byte) 39); var7 != null; var7 = (class43) class4.field82.method2297(true)) {
            byte var8 = 1;
            class322 var9 = var7.field576.method1917(0);
            if (var7.field576.field4663) {
                var8 = 0;
            } else if (var7.field576.field4620 == var9.field4806 || var7.field576.field4620 == var9.field4817 || var7.field576.field4620 == var9.field4832 || var7.field576.field4620 == var9.field4812) {
                var8 = 2;
            } else if (var7.field576.field4620 == var9.field4834 || var7.field576.field4620 == var9.field4816 || var7.field576.field4620 == var9.field4800 || var7.field576.field4620 == var9.field4825) {
                var8 = 3;
            }
            if (var7.field593 != var8) {
                int var10 = class182.method1252(var7.field576, -1);
                if (var7.field589 != var10) {
                    if (var7.field580 != null) {
                        class452.field6419.method2415(var7.field580);
                        var7.field580 = null;
                    }
                    var7.field589 = var10;
                }
                var7.field593 = var8;
            }
            var7.field583 = var7.field576.field4543;
            var7.field594 = var7.field576.field4543 + var7.field576.method1705((byte) 65) * 64;
            var7.field585 = var7.field576.field4538;
            var7.field577 = var7.field576.field4538 + var7.field576.method1705((byte) 65) * 64;
            class370.method2293(arg3, var7, arg1, arg2, 8048, arg0);
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIB)V", line = 174)
    public class275(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4178 = arg1;
        this.field4175 = arg4;
        this.field4174 = arg2;
        this.field4168 = arg0;
        this.field4169 = arg3;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lqt;I)V", line = 185)
    public class275(class275 arg0, int arg1) {
        this.field4177 = arg0;
        this.field4174 = this.field4177.field4174 + arg1;
        this.field4169 = this.field4177.field4169 + arg1;
        this.field4175 = this.field4177.field4175;
        this.field4178 = this.field4177.field4178 + arg1;
        this.field4168 = this.field4177.field4168;
    }
}
