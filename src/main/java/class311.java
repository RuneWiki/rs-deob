import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class311 {

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public int field4254 = 0;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public int field4255 = 3;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public int field4253 = 0;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public int field4262 = 127;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Z")
    public boolean field4264 = true;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public int field4263 = 2;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public int field4249 = 0;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public int field4272 = 2;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public int field4280 = 0;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public int field4268 = 1;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public int field4252 = 255;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public int field4269 = 0;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public int field4277 = 0;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "Z")
    public boolean field4286 = false;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public int field4256 = 2;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "Z")
    public boolean field4271 = false;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "Z")
    public boolean field4279 = true;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public int field4273 = 127;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public int field4265 = 2;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Z")
    public boolean field4260 = true;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "Z")
    public boolean field4283 = true;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Z")
    public boolean field4250 = true;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Z")
    public boolean field4281 = true;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "Z")
    public boolean field4284 = true;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Z")
    public boolean field4266 = true;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "Z")
    public boolean field4274 = true;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public int field4275 = 0;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Z")
    public boolean field4258 = true;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "Z")
    public boolean field4278 = false;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "Z")
    public boolean field4287 = true;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Z")
    public boolean field4251 = true;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field4259 = -1;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "Ljm;")
    public static class485 field4290 = new class485(2, 8);

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4292 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "F")
    public static float field4257;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Z")
    public boolean field4261;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "Z")
    public boolean field4276;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "Z")
    public boolean field4285;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "[[S")
    public static short[][] field4288;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZII)V")
    public final void method1761(boolean arg0, int arg1, int arg2) {
        if (arg1 != -682) {
            return;
        }
        field4270++;
        if (arg2 == 1 || arg2 == 3) {
            this.field4276 = arg0;
        } else {
            this.field4285 = arg0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBI)V")
    public final void method1762(int arg0, byte arg1, int arg2) {
        if (arg2 == 1 || arg2 == 3) {
            this.field4265 = arg0;
        } else {
            this.field4277 = arg0;
        }
        field4289++;
        if (arg1 != 35) {
            this.method1761(true, 96, -118);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Z")
    public final boolean method1763(int arg0, byte arg1) {
        if (arg1 <= 70) {
            this.method1762(-103, (byte) 119, 25);
        }
        field4267++;
        return arg0 == 1 || arg0 == 3 ? this.field4276 : this.field4285;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;CI)I")
    public static final int method1764(String arg0, char arg1, int arg2) {
        field4282++;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = arg2; var5 < var4; var5++) {
            if (arg1 == arg0.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IB)I")
    public final int method1765(int arg0, byte arg1) {
        if (arg1 != -101) {
            this.method1765(95, (byte) -48);
        }
        field4291++;
        return arg0 == 1 || arg0 == 3 ? this.field4265 : this.field4277;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static void method1766(boolean arg0) {
        field4288 = null;
        field4290 = null;
        if (!arg0) {
            field4259 = -110;
        }
        field4292 = null;
    }

    static {
        new class83("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
    }
}
