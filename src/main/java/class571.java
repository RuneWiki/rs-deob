import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class571 extends class28 {

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "I")
    public static int field7911 = 0;

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "I")
    public int field7897;

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "I")
    public int field7898;

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "I")
    public int field7899;

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "I")
    public int field7901;

    @OriginalMember(owner = "client!bda", name = "q", descriptor = "I")
    public int field7902;

    @OriginalMember(owner = "client!bda", name = "r", descriptor = "I")
    public int field7903;

    @OriginalMember(owner = "client!bda", name = "s", descriptor = "I")
    public int field7904;

    @OriginalMember(owner = "client!bda", name = "t", descriptor = "I")
    public int field7905;

    @OriginalMember(owner = "client!bda", name = "u", descriptor = "I")
    public int field7906;

    @OriginalMember(owner = "client!bda", name = "v", descriptor = "I")
    public int field7907;

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "I")
    public int field7909;

    @OriginalMember(owner = "client!bda", name = "y", descriptor = "I")
    public int field7910;

    @OriginalMember(owner = "client!bda", name = "A", descriptor = "I")
    public int field7912;

    @OriginalMember(owner = "client!bda", name = "B", descriptor = "I")
    public int field7913;

    @OriginalMember(owner = "client!bda", name = "C", descriptor = "I")
    public int field7914;

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "Lfl;")
    public static class648 field7908;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bda", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field7915;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILoa;I)Lba;")
    public final class629 method3223(int arg0, class689 arg1, int arg2) {
        field7895++;
        int var4 = class286.field3869[this.field7901];
        if (arg2 < 11) {
            method3224((byte) -111, -41, null);
        }
        class629 var5 = null;
        if (var4 == 0) {
            class142 var12 = class147.method997(this.field7899, this.field7914, this.field7909);
            if (var12 instanceof class46) {
                class46 var13 = (class46) var12;
                if (var13.field613 != null) {
                    var5 = ((class289) var13.field613).method124(arg0, 17925, arg1);
                }
            }
        } else if (var4 == 1) {
            class249 var10 = class7.method44(this.field7899, this.field7914, this.field7909);
            if (var10 instanceof class202) {
                class202 var11 = (class202) var10;
                if (var11.field2661 != null) {
                    var5 = ((class289) var11.field2661).method124(arg0, 17925, arg1);
                }
            }
        } else if (var4 == 2) {
            class293 var6 = class609.method3354(this.field7899, this.field7914, this.field7909, field7915 == null ? (field7915 = method3227("dda")) : field7915);
            if (var6 instanceof class613) {
                class613 var7 = (class613) var6;
                if (var7.field8366 != null) {
                    var5 = ((class289) var7.field8366).method124(arg0, 17925, arg1);
                }
            }
        } else if (var4 == 3) {
            class331 var8 = class618.method3391(this.field7899, this.field7914, this.field7909);
            if (var8 instanceof class304) {
                class304 var9 = (class304) var8;
                if (var9.field4086 != null) {
                    var5 = ((class289) var9.field4086).method124(arg0, 17925, arg1);
                }
            }
        }
        return var5 == null ? null : var5.method659((byte) 0, arg0, true);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BILjava/util/Random;)I")
    public static final int method3224(byte arg0, int arg1, Random arg2) {
        field7900++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class144.method986(arg1, (byte) -109)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            int var5 = 98 % ((44 - arg0) / 51);
            return class547.method3076(arg1, 100, var4);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)Z")
    public static final boolean method3225(byte arg0) {
        if (arg0 != 41) {
            return false;
        }
        field7896++;
        if (class497.field6725) {
            try {
                class302.method1821(class372.field5359, 10049, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    public static void method3226(int arg0) {
        field7908 = null;
        if (arg0 != Integer.MIN_VALUE) {
            method3225((byte) 33);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3227(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
