import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class432 {

    @OriginalMember(owner = "client!et", name = "p", descriptor = "I")
    private int field6147 = -1;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    private int field6140 = 0;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "Lat;")
    private class412 field6135 = new class412();

    @OriginalMember(owner = "client!et", name = "v", descriptor = "Z")
    public boolean field6153 = false;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    private int field6145;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    private int field6136;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "[[I")
    private int[][] field6138;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "[Ldn;")
    private class190[] field6134;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "[Z")
    public static boolean[] field6132 = new boolean[8];

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public static int field6142 = 0;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "I")
    public static int field6151 = 0;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "Z")
    public static boolean field6152 = false;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "Ldi;")
    public static class166 field6146;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "Ltq;")
    public static class63 field6150;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
    public final void method2527(boolean arg0) {
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field6145; var2++) {
            this.field6138[var2] = null;
        }
        field6141++;
        this.field6138 = null;
        this.field6134 = null;
        this.field6135.method2459(300);
        this.field6135 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public static void method2528(int arg0) {
        field6150 = null;
        if (arg0 < 101) {
            field6137 = 4;
        }
        field6146 = null;
        field6132 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)I")
    public static final int method2529(byte arg0) {
        if (arg0 != 26) {
            field6150 = null;
        }
        field6139++;
        if ((double) class189.field2894 == 3.0D) {
            return 37;
        } else if ((double) class189.field2894 == 4.0D) {
            return 50;
        } else if ((double) class189.field2894 == 6.0D) {
            return 75;
        } else if ((double) class189.field2894 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)V")
    public static final void method2530(int arg0, int arg1) {
        if (arg1 != -1125829008) {
            return;
        }
        for (class35 var2 = class206.field3111.method2296((byte) 39); var2 != null; var2 = class206.field3111.method2297(true)) {
            if ((long) arg0 == (var2.field436 >> 48 & 0xFFFFL)) {
                var2.method283(2);
            }
        }
        field6143++;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)[[I")
    public final int[][] method2531(int arg0) {
        field6149++;
        if (this.field6145 != this.field6136) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field6145; var2++) {
            this.field6134[var2] = class286.field4373;
        }
        if (arg0 != -9443) {
            method2528(-55);
        }
        return this.field6138;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)Llt;")
    public static final class186 method2532(int arg0) {
        field6148++;
        if (arg0 != 1) {
            method2530(-124, -53);
        }
        class186 var1 = (class186) class361.field5466.method1070((byte) -48);
        if (var1 != null) {
            var1.method283(2);
            var1.method701(arg0 ^ 0xFFFFFFFB);
            return var1;
        }
        class186 var2;
        do {
            var2 = (class186) class431.field6125.method1070((byte) -122);
            if (var2 == null) {
                return null;
            }
            if (var2.method1281(32) > class435.method2539(arg0 ^ 0xFFFFD65C)) {
                return null;
            }
            var2.method283(2);
            var2.method701(-52);
        } while ((Long.MIN_VALUE & var2.field1255) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)[I")
    public final int[] method2533(boolean arg0, int arg1) {
        field6133++;
        if (!arg0) {
            return null;
        } else if (this.field6145 == this.field6136) {
            this.field6153 = this.field6134[arg1] == null;
            this.field6134[arg1] = class286.field4373;
            return this.field6138[arg1];
        } else if (this.field6145 == 1) {
            this.field6153 = this.field6147 != arg1;
            this.field6147 = arg1;
            return this.field6138[0];
        } else {
            class190 var3 = this.field6134[arg1];
            if (var3 == null) {
                this.field6153 = true;
                if (this.field6140 >= this.field6145) {
                    class190 var4 = (class190) this.field6135.method2454((byte) 114);
                    var3 = new class190(arg1, var4.field2919);
                    this.field6134[var4.field2922] = null;
                    var4.method283(2);
                } else {
                    var3 = new class190(arg1, this.field6140);
                    this.field6140++;
                }
                this.field6134[arg1] = var3;
            } else {
                this.field6153 = false;
            }
            this.field6135.method2465((byte) 108, var3);
            return this.field6138[var3.field2919];
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(III)V")
    public class432(int arg0, int arg1, int arg2) {
        this.field6145 = arg0;
        this.field6136 = arg1;
        this.field6138 = new int[this.field6145][arg2];
        this.field6134 = new class190[this.field6136];
    }
}
