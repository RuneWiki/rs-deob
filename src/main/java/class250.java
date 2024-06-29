import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class250 {

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    private int field4349 = -1;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    private int field4343 = 0;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Lke;")
    private class106 field4340 = new class106();

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "Z")
    public boolean field4355 = false;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    private int field4348;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    private int field4347;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "[[[I")
    private int[][][] field4344;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "[Lsg;")
    private class34[] field4345;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "Lcd;")
    public static class64 field4346 = class44.method335((byte) 71, ":");

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "Z")
    public static boolean field4342 = true;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "S")
    public static short field4335 = 32767;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Lcd;")
    public static class64 field4338 = class44.method335((byte) 71, "l");

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field4351 = 0;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field4353 = 0;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lii;")
    public static class203 field4341;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 5)
    public static void method1794(byte arg0) {
        field4338 = null;
        if (arg0 != -25) {
            method1799(120, (class60) null);
        }
        field4341 = null;
        field4346 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V", line = 18)
    public final void method1795(boolean arg0) {
        field4354++;
        for (int var2 = 0; var2 < this.field4348; var2++) {
            this.field4344[var2][0] = null;
            this.field4344[var2][1] = null;
            this.field4344[var2][2] = null;
            this.field4344[var2] = (int[][]) null;
        }
        this.field4345 = null;
        if (arg0) {
            this.field4344 = (int[][][]) null;
            this.field4340.method776((byte) 84);
            this.field4340 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V", line = 45)
    public static final void method1796(boolean arg0) {
        field4350++;
        class122.field2190.method1187(0);
        if (!arg0) {
            method1794((byte) -105);
        }
        class27.field435.method1187(0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[[I", line = 68)
    public final int[][] method1797(int arg0, int arg1) {
        field4339++;
        if (arg1 >= -14) {
            return (int[][]) ((int[][]) null);
        } else if (this.field4348 == this.field4347) {
            this.field4355 = this.field4345[arg0] == null;
            this.field4345[arg0] = class292.field5033;
            return this.field4344[arg0];
        } else if (this.field4348 == 1) {
            this.field4355 = this.field4349 != arg0;
            this.field4349 = arg0;
            return this.field4344[0];
        } else {
            class34 var3 = this.field4345[arg0];
            if (var3 == null) {
                this.field4355 = true;
                if (this.field4348 <= this.field4343) {
                    class34 var4 = (class34) this.field4340.method779(28619);
                    var3 = new class34(arg0, var4.field559);
                    this.field4345[var4.field551] = null;
                    var4.method232(128);
                } else {
                    var3 = new class34(arg0, this.field4343);
                    this.field4343++;
                }
                this.field4345[arg0] = var3;
            } else {
                this.field4355 = false;
            }
            this.field4340.method782(var3, 22774);
            return this.field4344[var3.field559];
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(III)V", line = 242)
    public class250(int arg0, int arg1, int arg2) {
        this.field4348 = arg0;
        this.field4347 = arg1;
        this.field4344 = new int[this.field4348][3][arg2];
        this.field4345 = new class34[this.field4347];
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)[[[I", line = 185)
    public final int[][][] method1798(int arg0) {
        field4352++;
        if (this.field4348 != this.field4347) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field4348; var2++) {
            this.field4345[var2] = class292.field5033;
        }
        return this.field4344;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILja;)Lja;", line = 210)
    public static final class60 method1799(int arg0, class60 arg1) {
        if (arg0 != 0) {
            field4335 = -23;
        }
        field4337++;
        class60 var2 = client.method1758(arg1);
        if (var2 == null) {
            var2 = arg1.field1083;
        }
        return var2;
    }
}
