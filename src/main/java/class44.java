import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class44 {

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "I")
    private int field608 = -1;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
    private int field603 = 0;

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "Lor;")
    private class594 field614 = new class594();

    @OriginalMember(owner = "client!kaa", name = "q", descriptor = "Z")
    public boolean field618 = false;

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "[Lde;")
    private class492[] field606;

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "[[I")
    private int[][] field612;

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "S")
    public static short field613 = 205;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "Lrl;")
    public static class672 field604 = new class672(30, 7);

    @OriginalMember(owner = "client!kaa", name = "o", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "F")
    public static float field617 = 0.25F;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)V", line = 7)
    public final void method530(byte arg0) {
        field610++;
        for (int var2 = 0; var2 < this.field609; var2++) {
            this.field612[var2] = null;
        }
        if (arg0 != 115) {
            method533(null, null, 17, 116);
        }
        this.field606 = null;
        this.field612 = null;
        this.field614.method3474(22090);
        this.field614 = null;
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(III)V", line = 243)
    public class44(int arg0, int arg1, int arg2) {
        this.field609 = arg0;
        this.field607 = arg1;
        this.field606 = new class492[this.field607];
        this.field612 = new int[this.field609][arg2];
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(B)[[I", line = 40)
    public final int[][] method531(byte arg0) {
        field611++;
        if (this.field609 != this.field607) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 >= -92) {
            this.field608 = -68;
        }
        for (int var2 = 0; var2 < this.field609; var2++) {
            this.field606[var2] = class611.field8692;
        }
        return this.field612;
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(B)V", line = 62)
    public static void method532(byte arg0) {
        field604 = null;
        if (arg0 != 77) {
            field604 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lbea;[BII)Lsm;", line = 77)
    public static final class259 method533(class205 arg0, byte[] arg1, int arg2, int arg3) {
        field602++;
        if (arg1 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramRawARB(arg3, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class417.field6373, 0);
        if (class417.field6373[0] != -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
        if (arg2 != 23148) {
            method533(null, null, -45, -40);
        }
        OpenGL.glBindProgramARB(arg3, 0);
        return new class259(arg0, arg3, var4);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BI)[I", line = 114)
    public final int[] method534(byte arg0, int arg1) {
        field615++;
        if (arg0 > -43) {
            return null;
        } else if (this.field609 == this.field607) {
            this.field618 = this.field606[arg1] == null;
            this.field606[arg1] = class611.field8692;
            return this.field612[arg1];
        } else if (this.field609 == 1) {
            this.field618 = this.field608 != arg1;
            this.field608 = arg1;
            return this.field612[0];
        } else {
            class492 var3 = this.field606[arg1];
            if (var3 == null) {
                this.field618 = true;
                if (this.field609 > this.field603) {
                    var3 = new class492(arg1, this.field603);
                    this.field603++;
                } else {
                    class492 var4 = (class492) this.field614.method3470(0);
                    var3 = new class492(arg1, var4.field7206);
                    this.field606[var4.field7205] = null;
                    var4.method707((byte) -97);
                }
                this.field606[arg1] = var3;
            } else {
                this.field618 = false;
            }
            this.field614.method3466(var3, (byte) -23);
            return this.field612[var3.field7206];
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BLie;)V", line = 185)
    public static final void method535(byte arg0, class6 arg1) {
        field605++;
        int var2 = arg1.method88((byte) 90);
        class523.field7617 = new class146[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class523.field7617[var3] = new class146();
            class523.field7617[var3].field2453 = arg1.method88((byte) 90);
            class523.field7617[var3].field2451 = arg1.method53((byte) 40);
        }
        class78.field993 = arg1.method88((byte) 90);
        class402.field6202 = arg1.method88((byte) 90);
        class693.field9717 = arg1.method88((byte) 90);
        class634.field8913 = new class226[class402.field6202 + 1 - class78.field993];
        if (arg0 >= -82) {
            field613 = -61;
        }
        for (int var4 = 0; var4 < class693.field9717; var4++) {
            int var5 = arg1.method88((byte) 90);
            class226 var6 = class634.field8913[var5] = new class226();
            var6.field9190 = arg1.method70(-9059);
            var6.field9193 = arg1.method72(-72);
            var6.field3637 = var5 + class78.field993;
            var6.field3640 = arg1.method53((byte) 40);
            var6.field3635 = arg1.method53((byte) 40);
        }
        class597.field8460 = arg1.method72(-81);
        class405.field6243 = true;
    }
}
