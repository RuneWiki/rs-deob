import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class62 {

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    private int field1223 = 0;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    private int field1235 = -1;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lch;")
    private class117 field1234 = new class117();

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "Z")
    public boolean field1236 = false;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[Lsf;")
    private class89[] field1229;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "[[I")
    private int[][] field1228;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[S")
    public static short[] field1226 = new short[256];

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1224 = 0;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field1231 = -1;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method456(byte arg0) {
        field1226 = null;
        if (arg0 < 70) {
            field1224 = 40;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public final void method457(boolean arg0) {
        field1227++;
        int var2 = 0;
        if (arg0) {
            this.method459(106);
        }
        while (var2 < this.field1232) {
            this.field1228[var2] = null;
            var2++;
        }
        this.field1228 = null;
        this.field1229 = null;
        this.field1234.method791(97);
        this.field1234 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)[I")
    public final int[] method458(int arg0, boolean arg1) {
        field1233++;
        if (arg1) {
            field1231 = 111;
        }
        if (this.field1232 == this.field1222) {
            this.field1236 = this.field1229[arg0] == null;
            this.field1229[arg0] = class21.field624;
            return this.field1228[arg0];
        } else if (this.field1232 == 1) {
            this.field1236 = this.field1235 != arg0;
            this.field1235 = arg0;
            return this.field1228[0];
        } else {
            class89 var3 = this.field1229[arg0];
            if (var3 == null) {
                this.field1236 = true;
                if (this.field1223 >= this.field1232) {
                    class89 var4 = (class89) this.field1234.method784((byte) 117);
                    var3 = new class89(arg0, var4.field1596);
                    this.field1229[var4.field1601] = null;
                    var4.method97(158);
                } else {
                    var3 = new class89(arg0, this.field1223);
                    this.field1223++;
                }
                this.field1229[arg0] = var3;
            } else {
                this.field1236 = false;
            }
            this.field1234.method794(-61, var3);
            return this.field1228[var3.field1596];
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)[[I")
    public final int[][] method459(int arg0) {
        field1230++;
        if (this.field1232 != this.field1222) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field1232; var2++) {
            this.field1229[var2] = class21.field624;
        }
        return this.field1228;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lfl;IIB)[Loe;")
    public static final class108[] method460(class192 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 65) {
            method456((byte) -91);
        }
        field1225++;
        return class28.method239(50, arg0, arg1, arg2) ? class103.method688(true) : null;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(III)V")
    public class62(int arg0, int arg1, int arg2) {
        this.field1222 = arg1;
        this.field1232 = arg0;
        this.field1229 = new class89[this.field1222];
        this.field1228 = new int[this.field1232][arg2];
    }
}
