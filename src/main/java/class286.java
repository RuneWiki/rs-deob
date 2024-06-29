import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class286 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Ltl;")
    private class400 field4361 = new class400(64);

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lui;")
    private class451 field4362;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Lsh;")
    public static class472 field4364 = new class472(36, 0);

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Ltl;")
    public static class400 field4369;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lo;")
    public static class332 field4370;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "Lct;")
    public static class285 field4372;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Ldn;")
    public static class190 field4373;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "Lo;")
    public static class332 field4375;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "F")
    public static float field4371;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public final void method1826(byte arg0) {
        if (arg0 <= 101) {
            return;
        }
        class400 var2 = this.field4361;
        synchronized (this.field4361) {
            this.field4361.method2388(-107);
        }
        field4367++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)V")
    public final void method1827(int arg0, byte arg1) {
        field4368++;
        class400 var3 = this.field4361;
        synchronized (this.field4361) {
            int var4 = 49 % ((arg1 + 66) / 60);
            this.field4361.method2389(false, arg0);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static final void method1828(int arg0) {
        class307.field4567 = -1;
        class200.field3037 = 0;
        class143.field2039 = false;
        field4363++;
        class299.field4470 = 0;
        class6.field107 = arg0;
        class88.field1240 = 1;
        class52.field753 = 0;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IB)Lai;")
    public final class322 method1829(int arg0, byte arg1) {
        field4366++;
        class400 var3 = this.field4361;
        class322 var4;
        synchronized (this.field4361) {
            var4 = (class322) this.field4361.method2393(-128, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 > -28) {
            this.field4362 = null;
        }
        byte[] var5 = this.field4362.method2691(arg0, 32, 0);
        class322 var6 = new class322();
        if (var5 != null) {
            var6.method1985(new class446(var5), 96);
        }
        class400 var7 = this.field4361;
        synchronized (this.field4361) {
            this.field4361.method2395(0, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
    public final void method1830(int arg0) {
        if (arg0 != 8) {
            return;
        }
        class400 var2 = this.field4361;
        synchronized (this.field4361) {
            this.field4361.method2401((byte) -71);
        }
        field4365++;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
    public static void method1831(int arg0) {
        if (arg0 > -97) {
            method1831(-94);
        }
        field4369 = null;
        field4373 = null;
        field4375 = null;
        field4364 = null;
        field4370 = null;
        field4372 = null;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lgp;ILui;)V")
    public class286(class430 arg0, int arg1, class451 arg2) {
        this.field4362 = arg2;
        this.field4362.method2662(32, (byte) -7);
    }

    static {
        new class332(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field4369 = new class400(10);
        field4370 = new class332("red:", "rot:", "rouge:", "vermelho:");
        field4372 = new class285(53, 8);
        field4373 = new class190(0, 0);
        field4374 = 0;
        field4375 = new class332("yellow:", "gelb:", "jaune:", "amarelo:");
    }
}
