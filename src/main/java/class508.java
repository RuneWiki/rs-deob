import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public abstract class class508 extends class322 {

    @OriginalMember(owner = "client!on", name = "i", descriptor = "Z")
    public static boolean field7387 = false;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "Z")
    public static boolean field7386 = false;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "Ldw;")
    public static class403 field7385 = new class403("", 14);

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field7391 = 0;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "[[Lec;")
    public static class68[][] field7389;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lem;)V", line = 8)
    public static final void method2988(class429 arg0) {
        if (class38.field572 >= 65535) {
            return;
        }
        class450 var1 = arg0.field6429;
        class435.field6486[class38.field572] = arg0;
        class16.field188[class38.field572] = false;
        class38.field572++;
        int var2 = arg0.field6440;
        if (arg0.field6432) {
            var2 = 0;
        }
        int var3 = arg0.field6440;
        if (arg0.field6426) {
            var3 = class76.field1315 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2696((byte) 122) + class331.field5211 - var1.method2694(false) >> class276.field4534;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2696((byte) 119) + var1.method2694(false) - class331.field5211 >> class276.field4534;
            if (var7 >= class276.field4537) {
                var7 = class276.field4537 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field6431[var5++];
                int var10 = (var1.method2700(false) + class331.field5211 - var1.method2694(false) >> class276.field4534) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class236.field4089) {
                    var11 = class236.field4089 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class355.field5541[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class355.field5541[var4][var12][var8] = var13 | (long) class38.field572;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class355.field5541[var4][var12][var8] = var13 | (long) class38.field572 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class355.field5541[var4][var12][var8] = var13 | (long) class38.field572 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class355.field5541[var4][var12][var8] = var13 | (long) class38.field572 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 101)
    public static void method2989(int arg0) {
        field7385 = null;
        field7389 = null;
        int var1 = -15 % ((arg0 - 22) / 44);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 111)
    public static final int method2990(String arg0, int arg1) {
        field7384++;
        if (arg1 != 23403) {
            method2989(12);
        }
        return class180.method1214(arg0, (byte) -111, true, 10);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Lhg;")
    public abstract class358 method373(int arg0);
}
