import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class337 {

    @OriginalMember(owner = "client!qea", name = "m", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4334 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!qea", name = "p", descriptor = "Lmha;")
    public static class701 field4337 = new class701(7, 0, 1, 1);

    @OriginalMember(owner = "client!qea", name = "q", descriptor = "F")
    public static float field4338;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public int field4324;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
    public int field4329;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
    public int field4331;

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "I")
    public int field4332;

    @OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
    public int field4333;

    @OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!qea", name = "o", descriptor = "I")
    public int field4336;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lqea;I)Z", line = 11)
    public final boolean method1956(class337 arg0, int arg1) {
        if (arg1 != -13144) {
            this.field4332 = -58;
        }
        field4327++;
        return this.field4322 == arg0.field4322 && this.field4323 == arg0.field4323 && this.field4324 == arg0.field4324;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V", line = 26)
    public static void method1957(int arg0) {
        int var1 = -47 % ((arg0 - 39) / 35);
        field4337 = null;
        field4334 = null;
    }
}
