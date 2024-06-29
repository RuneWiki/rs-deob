import java.math.BigInteger;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class151 implements class40 {

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[F")
    private float[] field2331 = new float[4];

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2329 = "shake:";

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "[Lm;")
    public static class49[] field2339 = new class49[6];

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field2338 = 0;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2330 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    private int field2327;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Log;")
    public static class157 field2340;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V", line = 12)
    public final void method69() {
        field2328++;
        GL var1 = class232.field3716;
        var1.glCallList(this.field2327);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 33)
    public static void method1097(int arg0) {
        field2329 = null;
        if (arg0 == -22432) {
            field2340 = null;
            field2339 = null;
            field2330 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()V", line = 47)
    public final void method71() {
        field2337++;
        GL var1 = class232.field3716;
        var1.glCallList(this.field2327 + 1);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "()I", line = 56)
    public final int method66() {
        field2335++;
        return 0;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V", line = 64)
    private final void method1098(int arg0) {
        field2333++;
        GL var2 = class232.field3716;
        this.field2327 = var2.glGenLists(arg0);
        var2.glNewList(this.field2327, 4864);
        var2.glActiveTexture(33985);
        if (class136.field2157) {
            var2.glBindTexture(32879, class136.field2155);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field2327 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class136.field2157) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V", line = 108)
    public static final void method1099(int arg0) {
        if (class97.field1386 < 128.0F) {
            class97.field1386 = 128.0F;
        }
        while (class330.field5090 >= 2048.0F) {
            class330.field5090 -= 2048.0F;
        }
        int var1 = class129.field2014 >> 7;
        if (class97.field1386 > 383.0F) {
            class97.field1386 = 383.0F;
        }
        field2332++;
        int var2 = class55.field772 >> 7;
        while (class330.field5090 < 0.0F) {
            class330.field5090 += 2048.0F;
        }
        int var3 = class123.method889(1, class49.field698, class55.field772, class129.field2014);
        if (arg0 != 255) {
            field2329 = (String) null;
        }
        int var4 = 0;
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var5 = var2 - 4; var5 <= var2 + 4; var5++) {
                for (int var6 = var1 - 4; var6 <= (var1 + 4); var6++) {
                    int var7 = class49.field698;
                    if (var7 < 3 && (class129.field2025[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class201.field3272[var7][var5][var6] & 0xFF) * 8 + var3 - class110.field1642[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class147.field2285 < var9) {
            class147.field2285 += (var9 - class147.field2285) / 24;
        } else if (class147.field2285 > var9) {
            class147.field2285 += (var9 - class147.field2285) / 80;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 186)
    public final void method72(int arg0) {
        field2336++;
        float var2 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        GL var3 = class232.field3716;
        float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field2331[3] = 0.0F;
            this.field2331[0] = var5;
            this.field2331[1] = 0.0F;
            this.field2331[2] = 0.0F;
        } else {
            this.field2331[0] = 0.0F;
            this.field2331[1] = 0.0F;
            this.field2331[3] = 0.0F;
            this.field2331[2] = var5;
        }
        var3.glActiveTexture(33985);
        var3.glMatrixMode(5888);
        var3.glPushMatrix();
        var3.glLoadIdentity();
        var3.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class61.field883 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class191.field3123 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var3.glTranslatef((float) (-class24.field329), (float) (-class338.field5270), (float) (-class123.field1923));
        var3.glTexGenfv(8192, 9474, this.field2331, 0);
        this.field2331[0] = 0.0F;
        this.field2331[1] = var5;
        this.field2331[2] = 0.0F;
        this.field2331[3] = (float) class232.field3701 * var2;
        var3.glTexGenfv(8193, 9474, this.field2331, 0);
        var3.glPopMatrix();
        if (class136.field2157) {
            this.field2331[0] = 0.0F;
            this.field2331[2] = 0.0F;
            this.field2331[1] = 0.0F;
            this.field2331[3] = (float) class232.field3701 * var4;
            var3.glTexGenfv(8194, 9473, this.field2331, 0);
        } else {
            int var7 = (int) ((float) class232.field3701 * var4 * 64.0F);
            var3.glBindTexture(3553, class136.field2159[var7 % 64]);
        }
        var3.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILak;IZ)Lek;", line = 253)
    public static final class220 method1100(int arg0, class172 arg1, int arg2, boolean arg3) {
        field2334++;
        if (arg3) {
            field2330 = (BigInteger) null;
        }
        return class55.method353(arg1, arg0, (byte) -5, arg2) ? class278.method2015((byte) 85) : null;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 272)
    public class151() {
        this.method1098(2);
    }
}
