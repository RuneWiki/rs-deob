import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class38 extends class45 {

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "Llc;")
    private class69 field1046;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "[La;")
    public static class1[] field1018 = new class1[100];

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "La;")
    private static class1 field1022 = class113.method934(-11538, "This computers address has been blocked");

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "La;")
    public static class1 field1025 = field1022;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "La;")
    private static class1 field1019 = class113.method934(-11538, "Enter your username (V password)3");

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "La;")
    public static class1 field1023 = class113.method934(-11538, "welle:");

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "La;")
    public static class1 field1031 = field1019;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "La;")
    private static class1 field1041 = class113.method934(-11538, "Loaded interfaces");

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "La;")
    public static class1 field1012 = class113.method934(-11538, "T");

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "La;")
    private static class1 field1037 = class113.method934(-11538, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "La;")
    public static class1 field1035 = class113.method934(-11538, "headicons_prayer");

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "[I")
    public static int[] field1020 = new int[5];

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "La;")
    private static class1 field1042 = class113.method934(-11538, "Report abuse");

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "La;")
    public static class1 field1032 = field1041;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "La;")
    public static class1 field1044 = field1037;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "La;")
    public static class1 field1039 = field1042;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "La;")
    private static class1 field1047 = class113.method934(-11538, "Password: ");

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "La;")
    public static class1 field1038 = field1047;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "La;")
    public static class1 field1045 = class113.method934(-11538, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "[I")
    public static int[] field1021 = new int[2000];

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "J")
    public static long field1015;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "Lbd;")
    public static class11 field1029;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "Led;")
    private class29 field1010;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "Z")
    private boolean field1009;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "Z")
    private boolean field1026;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "[B")
    private byte[] field1040;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V", line = 23)
    public final void method305(int arg0, int arg1) {
        if (arg1 != 0) {
            field1022 = null;
        }
        field1036++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 33)
    public final void method306(byte arg0) {
        field1013++;
        if (this.field1009) {
            try {
                class65.method632(this.field1046.field1722, "midibox.src=\"c:/silence.mid\";", arg0 ^ 0x6F0F);
            } catch (Throwable var2) {
            }
            this.field1009 = false;
        }
        if (arg0 == -96) {
            this.field1010 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V", line = 69)
    public static void method422(int arg0) {
        field1032 = null;
        field1035 = null;
        field1022 = null;
        field1020 = null;
        field1042 = null;
        field1037 = null;
        field1021 = null;
        field1025 = null;
        field1044 = null;
        field1038 = null;
        field1045 = null;
        field1041 = null;
        field1047 = null;
        field1012 = null;
        field1031 = null;
        field1039 = null;
        field1019 = null;
        field1018 = null;
        field1023 = null;
        field1029 = null;
        if (arg0 <= 56) {
            field1030 = 74;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 98)
    public final void method309(int arg0) {
        field1027++;
        if (this.field1010 == null || this.field1010.field816 == 0) {
            return;
        }
        if (this.field1010.field816 == 1) {
            class96 var2 = (class96) this.field1010.field819;
            try {
                var2.method835(this.field1040, 0, this.field1040.length, false);
                var2.method834(1);
                try {
                    class65.method632(this.field1046.field1722, "midibox.loop=" + (this.field1026 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method832(false).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field1034 + ";", -28497);
                    this.field1009 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method834(1);
                } catch (Exception var3) {
                }
            }
        }
        this.field1010 = null;
        if (arg0 != 0) {
            field1029 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V", line = 143)
    public final void method304(byte arg0) {
        field1011++;
        if (arg0 < 100) {
            field1035 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 161)
    public static final void method423(byte arg0, Component arg1) {
        field1028++;
        arg1.removeKeyListener(class117.field2927);
        arg1.removeFocusListener(class117.field2927);
        int var2 = -46 % ((75 - arg0) / 35);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BII)V", line = 173)
    public final void method303(byte arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            arg1 = 1;
        }
        if (arg0 > -82) {
            this.method304((byte) 27);
        }
        field1014++;
        int var4 = class66.method635(120, arg1) - arg2;
        if (this.field1010 != null) {
            this.field1034 = var4;
        } else if (this.field1009) {
            try {
                class65.method632(this.field1046.field1722, "midibox.volume=" + var4 + ";", -28497);
            } catch (Throwable var5) {
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)V", line = 203)
    public static final void method424(int arg0, int arg1, int arg2, int arg3) {
        field1033++;
        if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
            class89.field2191 = -1;
            class39.field1073 = -1;
            return;
        }
        int var4 = class78.method715((byte) -122, class2.field76, arg2, arg1) - arg0;
        int var5 = arg1 - class46.field1202;
        int var6 = var4 - class70.field1751;
        int var7 = class91.field2261[class53.field1403];
        int var8 = class91.field2259[class53.field1403];
        int var9 = arg2 - class23.field710;
        int var10 = class91.field2259[class4.field185];
        int var11 = class91.field2261[class4.field185];
        int var12 = var5 * var10 + var9 * var11 >> 16;
        int var13 = var5 * var11 - var9 * var10 >> 16;
        if (arg3 != 4976905) {
            field1038 = null;
        }
        int var15 = var6 * var7 - var8 * var13 >> 16;
        int var16 = var6 * var8 + var7 * var13 >> 16;
        if (var16 < 50) {
            class89.field2191 = -1;
            class39.field1073 = -1;
        } else {
            class39.field1073 = (var12 << 9) / var16 + 256;
            class89.field2191 = (var15 << 9) / var16 + 167;
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V", line = 251)
    public static final void method425(int arg0) {
        field1016++;
        for (int var1 = -1; var1 < class118.field2942; var1++) {
            int var6;
            if (var1 == -1) {
                var6 = 2047;
            } else {
                var6 = class112.field2761[var1];
            }
            class2 var7 = class80.field2033[var6];
            if (var7 != null && var7.field1955 > 0) {
                var7.field1955--;
                if (var7.field1955 == 0) {
                    var7.field1967 = null;
                }
            }
        }
        int var2 = 18 % ((-arg0 - 46) / 58);
        for (int var3 = 0; var3 < class49.field1343; var3++) {
            int var4 = class22.field678[var3];
            class130 var5 = class120.field2995[var4];
            if (var5 != null && var5.field1955 > 0) {
                var5.field1955--;
                if (var5.field1955 == 0) {
                    var5.field1967 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([BZII)V", line = 319)
    public final void method308(byte[] arg0, boolean arg1, int arg2, int arg3) {
        this.field1010 = this.field1046.method661(86);
        field1017++;
        if (arg2 != -15910 || this.field1010 == null) {
            return;
        }
        if (arg3 == 0) {
            arg3 = 1;
        }
        this.field1034 = class66.method635(arg2 ^ 0xFFFFC1A6, arg3);
        this.field1040 = arg0;
        this.field1026 = arg1;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Llc;)V", line = 382)
    public class38(class69 arg0) {
        this.field1046 = arg0;
    }
}
