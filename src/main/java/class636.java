import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class636 {

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "F")
    public float field9149 = 0.25F;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "F")
    public float field9145 = 1.0F;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "F")
    public float field9146 = 1.0F;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public int field9157;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "F")
    public float field9154;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public int field9158;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "F")
    public float field9139;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public int field9142;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "F")
    public float field9138;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "Ldw;")
    public class622 field9140;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public int field9144;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public int field9153;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public int field9152;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Lqf;")
    public static class593 field9141 = null;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "[I")
    public static int[] field9143 = new int[8];

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public static int field9156;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fm", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field9159;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "[B")
    public static byte[] field9148;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3632(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lfm;I)Z", line = 4)
    public final boolean method3627(class636 arg0, int arg1) {
        if (arg1 == 0) {
            field9155++;
            return this.field9144 == arg0.field9144 && this.field9139 == arg0.field9139 && this.field9154 == arg0.field9154 && this.field9138 == arg0.field9138 && this.field9149 == arg0.field9149 && this.field9145 == arg0.field9145 && this.field9146 == arg0.field9146 && this.field9142 == arg0.field9142 && this.field9152 == arg0.field9152 && this.field9140 == arg0.field9140;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 19)
    public static void method3628(int arg0) {
        field9141 = null;
        field9148 = null;
        if (arg0 >= -31) {
            field9141 = null;
        }
        field9143 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lqf;III)V", line = 39)
    public static final void method3629(class593 arg0, int arg1, int arg2, int arg3) {
        field9150++;
        if (class169.field2063) {
            class403 var4 = class17.field174 == -1 ? null : class565.field8053.method3495(3, class17.field174);
            if (client.method1682(arg0).method1772(-680557226) && (class580.field8354 & 0x20) != 0 && (var4 == null || arg0.method3463(class17.field174, var4.field6089, false) != var4.field6089)) {
                class439.field6536++;
                class36.method198(true, class180.field2210 + " -> " + arg0.field8563, arg0.field8601, class442.field6600, class259.field3692, true, arg0.field8579, arg0.field8593, false, 13, 0L);
            }
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var10 = class112.method689((byte) 99, var5, arg0);
            if (var10 != null) {
                class162.field1984++;
                class36.method198(true, arg0.field8563, arg0.field8601, var10, class74.method489(arg0, -13403, var5), true, arg0.field8579, arg0.field8593, false, 1003, (long) (var5 + 1));
            }
        }
        String var6 = class309.method2051(arg0, (byte) 102);
        int var7 = 54 % ((arg3 + 55) / 52);
        if (var6 != null) {
            class36.method198(true, arg0.field8563, arg0.field8601, var6, arg0.field8604, true, arg0.field8579, arg0.field8593, false, 20, 0L);
            class95.field1123++;
        }
        for (int var8 = 4; var8 >= 0; var8--) {
            String var9 = class112.method689((byte) 86, var8, arg0);
            if (var9 != null) {
                class36.method198(true, arg0.field8563, arg0.field8601, var9, class74.method489(arg0, -13403, var8), true, arg0.field8579, arg0.field8593, false, 50, (long) (var8 + 1));
                class162.field1984++;
            }
        }
        if (!client.method1682(arg0).method1776(-94)) {
            return;
        }
        if (arg0.field8643 == null) {
            class36.method198(true, "", arg0.field8601, class647.field9360.method2902(class35.field396, -20139), -1, true, arg0.field8579, arg0.field8593, false, 58, 0L);
        } else {
            class36.method198(true, "", arg0.field8601, arg0.field8643, -1, true, arg0.field8579, arg0.field8593, false, 58, 0L);
        }
        class646.field9347++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 119)
    public static final boolean method3630(int arg0, String arg1) {
        field9151++;
        if (arg0 < 86) {
            field9143 = null;
        }
        return class458.method2825(arg1, false, field9159 == null ? (field9159 = method3632("mi")) : field9159);
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 165)
    public class636() {
        this.field9157 = -50;
        this.field9154 = 0.69921875F;
        this.field9158 = -50;
        this.field9139 = 1.1523438F;
        this.field9142 = class102.field1226;
        this.field9138 = 1.2F;
        this.field9140 = class266.field3755;
        this.field9144 = class404.field6105;
        this.field9153 = -60;
        this.field9152 = 0;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lrt;)V", line = 181)
    public class636(class194 arg0) {
        int var2 = arg0.method1177(255);
        if (class595.field8694.method2732(class81.field908, (byte) -120) && class108.field1302.method324() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field9144 = class404.field6105;
            } else {
                this.field9144 = arg0.method1178(-230315992);
            }
            if ((var2 & 0x2) == 0) {
                this.field9139 = 1.1523438F;
            } else {
                this.field9139 = (float) arg0.method1220(116) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field9154 = 0.69921875F;
            } else {
                this.field9154 = (float) arg0.method1220(-120) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field9138 = 1.2F;
            } else {
                this.field9138 = (float) arg0.method1220(-95) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1178(-230315992);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1220(-119);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1220(121);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1220(-74);
            }
            this.field9138 = 1.2F;
            this.field9139 = 1.1523438F;
            this.field9144 = class404.field6105;
            this.field9154 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field9157 = -50;
            this.field9153 = -60;
            this.field9158 = -50;
        } else {
            this.field9157 = arg0.method1233(65280);
            this.field9153 = arg0.method1233(65280);
            this.field9158 = arg0.method1233(65280);
        }
        if ((var2 & 0x20) == 0) {
            this.field9142 = class102.field1226;
        } else {
            this.field9142 = arg0.method1178(-230315992);
        }
        if ((var2 & 0x40) == 0) {
            this.field9152 = 0;
        } else {
            this.field9152 = arg0.method1220(127);
        }
        if ((var2 & 0x80) == 0) {
            this.field9140 = class266.field3755;
        } else {
            int var3 = arg0.method1220(125);
            int var4 = arg0.method1220(-86);
            int var5 = arg0.method1220(-122);
            int var6 = arg0.method1220(-91);
            int var7 = arg0.method1220(-121);
            int var8 = arg0.method1220(-9);
            this.field9140 = class82.method545(var5, -125, var7, var8, var6, var3, var4);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lrt;Z)V", line = 148)
    public final void method3631(class194 arg0, boolean arg1) {
        this.field9145 = (float) (arg0.method1177(255) * 8) / 255.0F;
        field9147++;
        this.field9149 = (float) (arg0.method1177(255) * 8) / 255.0F;
        if (arg1) {
            this.field9158 = 33;
        }
        this.field9146 = (float) (arg0.method1177(255) * 8) / 255.0F;
    }
}
