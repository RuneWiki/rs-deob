import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class436 {

    @OriginalMember(owner = "client!km", name = "g", descriptor = "F")
    public static float field6359 = 1024.0F;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field6354 = -1;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field6356 = 0;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static final void method2733(byte arg0) {
        if (arg0 != -115) {
            return;
        }
        field6355++;
        class86.method655(-124);
        class122.field1928 = null;
        class221.field3296 = null;
        class428.field6202 = null;
        class84.field1369 = null;
        class281.field4217 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2734(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6357++;
        int var7 = class102.method843(arg5, class383.field5497, class308.field4507, 0);
        int var8 = class102.method843(arg3, class383.field5497, class308.field4507, arg2 ^ arg2);
        int var9 = class102.method843(arg1, class278.field4184, class185.field2727, 0);
        int var10 = class102.method843(arg6, class278.field4184, class185.field2727, 0);
        int var11 = class102.method843(arg4 + arg5, class383.field5497, class308.field4507, 0);
        int var12 = class102.method843(arg3 - arg4, class383.field5497, class308.field4507, 0);
        for (int var13 = var7; var13 < var11; var13++) {
            class47.method379(var10, (byte) 117, arg0, class286.field4283[var13], var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class47.method379(var10, (byte) 102, arg0, class286.field4283[var14], var9);
        }
        int var15 = class102.method843(arg1 + arg4, class278.field4184, class185.field2727, 0);
        int var16 = class102.method843(arg6 - arg4, class278.field4184, class185.field2727, 0);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class286.field4283[var17];
            class47.method379(var15, (byte) 71, arg0, var18, var9);
            class47.method379(var10, (byte) 120, arg0, var18, var16);
        }
    }
}
