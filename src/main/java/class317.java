import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class317 {

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Z")
    public static boolean field4623 = true;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Z")
    public static boolean field4625;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method1953(int arg0) {
        field4624++;
        int var1 = class46.field602.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class46.field602[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class229.field3180; var4++) {
                    if (class352.field5066[var4] == class217.field3034[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class352.field5066[class229.field3180] = class217.field3034[var2];
                    var3 = class229.field3180++;
                }
                class179 var5 = new class179(class46.field602[var2]);
                int var6 = 0;
                while (var5.field2206 < class46.field602[var2].length && var6 < 511 && class356.field5112 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method916(21933);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FB6) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class217.field3034[var2] >> 8) * 64 + var10 - class93.field1163;
                    int var13 = (class217.field3034[var2] & 0xFF) * 64 + var11 - class349.field5023;
                    class476 var14 = class390.field5575.method2507((byte) -114, var5.method916(21933));
                    if (class448.field6366[var7] == null && (var14.field6718 & 0x1) > 0 && class346.field4942 == var9 && var12 >= 0 && class159.field1895 > (var12 + var14.field6695) && var13 >= 0 && class289.field4316 > (var14.field6695 + var13)) {
                        class448.field6366[var7] = new class137();
                        class448.field6366[var7].field2457 = var7;
                        class137 var15 = class448.field6366[var7];
                        class25.field353[class356.field5112++] = var7;
                        var15.field2489 = class204.field2796;
                        var15.method651((byte) 101, var14);
                        var15.method1020(true, var15.field1643.field6695);
                        var15.field2519 = var15.field1643.field6698 << 3;
                        if (var15.field2519 == 0) {
                            var15.method1015((byte) -8, 0);
                        } else {
                            var15.method1015((byte) -8, var15.field1643.field6699 + 4 << 11 & 0x3E8A);
                        }
                        var15.method650(true, var12, (byte) -89, var9, var15.method1012(false), var13);
                    }
                }
            }
        }
        if (arg0 != 1190538382) {
            field4626 = -127;
        }
    }

    static {
        new class40("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field4625 = false;
    }
}
