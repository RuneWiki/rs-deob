import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class243 {

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    private int field4348 = -1;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    private int field4347 = 0;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Lrk;")
    private class257 field4351 = new class257();

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Z")
    public boolean field4355 = false;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    private int field4344;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[[[I")
    private int[][][] field4340;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    private int field4342;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "[Lgd;")
    private class73[] field4350;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4345 = -1;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4349 = -1;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Z")
    public static boolean field4352 = false;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Ljd;")
    public static class86 field4354 = class122.method868("m-Ochte mit Ihnen handeln)3", true);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1657(int arg0, byte arg1) {
        if (arg1 > -75) {
            field4354 = null;
        }
        field4346++;
        if (this.field4344 == this.field4342) {
            this.field4355 = this.field4350[arg0] == null;
            this.field4350[arg0] = class56.field1156;
            return this.field4340[arg0];
        } else if (this.field4344 == 1) {
            this.field4355 = this.field4348 != arg0;
            this.field4348 = arg0;
            return this.field4340[0];
        } else {
            class73 var3 = this.field4350[arg0];
            if (var3 == null) {
                this.field4355 = true;
                if (this.field4347 < this.field4344) {
                    var3 = new class73(arg0, this.field4347);
                    this.field4347++;
                } else {
                    class73 var4 = (class73) this.field4351.method1730((byte) 94);
                    var3 = new class73(arg0, var4.field1482);
                    this.field4350[var4.field1476] = null;
                    var4.method1477(1);
                }
                this.field4350[arg0] = var3;
            } else {
                this.field4355 = false;
            }
            this.field4351.method1738(var3, (byte) -103);
            return this.field4340[var3.field1482];
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
    public static final void method1658(int arg0, int arg1, int arg2) {
        field4343++;
        class161 var3 = class204.method1456(true, 1, arg1);
        if (arg2 != 3) {
            field4354 = null;
        }
        var3.method1174(0);
        var3.field3027 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public final void method1659(int arg0) {
        field4341++;
        for (int var2 = 0; var2 < this.field4344; var2++) {
            this.field4340[var2][0] = null;
            this.field4340[var2][1] = null;
            this.field4340[var2][2] = null;
            this.field4340[var2] = null;
        }
        this.field4350 = null;
        this.field4340 = null;
        this.field4351.method1739(true);
        if (arg0 != 24274) {
            method1658(-46, -48, 111);
        }
        this.field4351 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1660(byte arg0) {
        if (arg0 != 77) {
            method1658(-85, 85, 9);
        }
        field4354 = null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method1661(int arg0) {
        field4353++;
        if (arg0 < 28) {
            this.field4348 = -70;
        }
        if (this.field4344 != this.field4342) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4344; var2++) {
            this.field4350[var2] = class56.field1156;
        }
        return this.field4340;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(III)V")
    public class243(int arg0, int arg1, int arg2) {
        this.field4344 = arg0;
        this.field4340 = new int[this.field4344][3][arg2];
        this.field4342 = arg1;
        this.field4350 = new class73[this.field4342];
    }
}
