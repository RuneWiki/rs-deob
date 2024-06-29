import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 extends class125 {

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public int field353 = -1;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "[I")
    private int[] field358 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "Z")
    public boolean field355 = false;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "Ljd;")
    public static class92 field352 = class202.method1325((byte) 90, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "Loe;")
    public static class139 field344 = new class139(200);

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "[[[I")
    public static int[][][] field360 = new int[4][13][13];

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "[I")
    public static int[] field361 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "Z")
    public static volatile boolean field363 = true;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "[I")
    private int[] field348;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "[Lsc;")
    public static class173[] field359;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "[S")
    private short[] field341;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "[S")
    private short[] field346;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "[S")
    private short[] field349;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "[S")
    private short[] field351;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)Lff;")
    public final class57 method67(boolean arg0) {
        field356++;
        if (this.field348 == null) {
            return null;
        }
        class57[] var2 = new class57[this.field348.length];
        if (arg0) {
            this.field355 = false;
        }
        for (int var3 = 0; var3 < this.field348.length; var3++) {
            var2[var3] = class57.method341(class209.field4021, this.field348[var3], 0);
        }
        class57 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class57(var2, var2.length);
        }
        if (this.field349 != null) {
            for (int var5 = 0; var5 < this.field349.length; var5++) {
                var4.method349(this.field349[var5], this.field341[var5]);
            }
        }
        if (this.field351 != null) {
            for (int var6 = 0; var6 < this.field351.length; var6++) {
                var4.method348(this.field351[var6], this.field346[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)Z")
    public final boolean method68(int arg0) {
        field343++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field358[var3] != -1 && !class209.field4021.method893(0, (byte) 56, this.field358[var3])) {
                var2 = false;
            }
        }
        if (arg0 >= -97) {
            field360 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(Z)Lff;")
    public final class57 method69(boolean arg0) {
        field345++;
        int var2 = 0;
        class57[] var3 = new class57[5];
        if (!arg0) {
            return null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field358[var4] != -1) {
                var3[var2++] = class57.method341(class209.field4021, this.field358[var4], 0);
            }
        }
        class57 var5 = new class57(var3, var2);
        if (this.field349 != null) {
            for (int var6 = 0; var6 < this.field349.length; var6++) {
                var5.method349(this.field349[var6], this.field341[var6]);
            }
        }
        if (this.field351 != null) {
            for (int var7 = 0; var7 < this.field351.length; var7++) {
                var5.method348(this.field351[var7], this.field346[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)Z")
    public final boolean method70(int arg0) {
        field347++;
        if (this.field348 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != -26025) {
            this.field355 = false;
        }
        while (this.field348.length > var3) {
            if (!class209.field4021.method893(0, (byte) 56, this.field348[var3])) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILh;)V")
    public final void method71(int arg0, class70 arg1) {
        field357++;
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var3 = arg1.method443(arg0 ^ 0xFFFFFF00);
            if (var3 == 0) {
                return;
            }
            this.method73(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)V")
    public static void method72(int arg0) {
        field359 = null;
        field344 = null;
        field360 = null;
        if (arg0 != 60) {
            field352 = null;
        }
        field352 = null;
        field361 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILh;I)V")
    private final void method73(int arg0, class70 arg1, int arg2) {
        field350++;
        if (arg2 == 1) {
            this.field353 = arg1.method443(arg0 + 255);
        } else if (arg2 == 2) {
            int var8 = arg1.method443(255);
            this.field348 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field348[var9] = arg1.method442(-21351);
            }
        } else if (arg2 == 3) {
            this.field355 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method443(255);
            this.field349 = new short[var6];
            this.field341 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field349[var7] = (short) arg1.method442(-21351);
                this.field341[var7] = (short) arg1.method442(-21351);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method443(255);
            this.field346 = new short[var4];
            this.field351 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field351[var5] = (short) arg1.method442(arg0 - 21351);
                this.field346[var5] = (short) arg1.method442(-21351);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field358[arg2 - 60] = arg1.method442(-21351);
        }
        if (arg0 != 0) {
            field344 = null;
        }
    }
}
