import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class class18 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[I")
    public static int[] field206 = new int[2];

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field209 = 0;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
    public static boolean field214 = false;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Z")
    public static boolean field210 = true;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Z")
    public static boolean field207 = false;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Llg;")
    public static class237 field211 = new class237(128);

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "[Lgj;")
    public static class381[] field215;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 4)
    public static void method117(byte arg0) {
        field211 = null;
        if (arg0 >= -86) {
            method124(112);
        }
        field206 = null;
        field215 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V", line = 21)
    public static final void method118() {
        class34.method212(1, class167.field2334);
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V", line = 42)
    public static final void method124(int arg0) {
        field213++;
        class237 var1 = class255.field3677;
        synchronized (class255.field3677) {
            class255.field3677.method1618(arg0 ^ 0x974);
        }
        class237 var2 = class150.field1839;
        synchronized (class150.field1839) {
            class150.field1839.method1618(arg0 ^ 0x974);
        }
        class237 var3 = class305.field4284;
        synchronized (class305.field4284) {
            class305.field4284.method1618(0);
        }
        class237 var4 = class425.field6071;
        synchronized (class425.field6071) {
            class425.field6071.method1618(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)I", line = 66)
    public static final int method126(boolean arg0, int arg1) {
        field208++;
        class244 var2 = class414.method2636(arg1, 31392);
        int var3 = var2.field3454;
        if (arg0) {
            return -24;
        } else {
            int var4 = var2.field3461;
            int var5 = var2.field3464;
            int var6 = class127.field1543[var5 - var4];
            return var6 & class4.field61[var3] >> var4;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIII)V", line = 87)
    public static final void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field212++;
        if (arg7 >= class81.field946 && class235.field3295 >= arg7 && arg5 >= class81.field946 && arg5 <= class235.field3295 && arg4 >= class81.field946 && arg4 <= class235.field3295 && class81.field946 <= arg1 && class235.field3295 >= arg1 && arg0 >= class388.field5464 && class219.field3080 >= arg0 && class388.field5464 <= arg9 && arg9 <= class219.field3080 && class388.field5464 <= arg6 && class219.field3080 >= arg6 && class388.field5464 <= arg3 && class219.field3080 >= arg3) {
            class444.method2768(arg0, arg5, arg2 ^ 0xB2F, arg7, arg8, arg9, arg1, arg4, arg6, arg3);
        } else {
            class264.method1758(-114, arg0, arg9, arg5, arg3, arg4, arg6, arg8, arg7, arg1);
        }
        if (arg2 != -6960) {
            method117((byte) 57);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
    public abstract void method116(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public abstract void method119(int arg0);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public abstract void method120(int arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([I)V")
    public abstract void method121(int[] arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III[I)V")
    public abstract void method122(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public abstract void method123(int arg0);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)V")
    public abstract void method125(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
    public abstract void method128(int arg0);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()V")
    public abstract void method129();

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
    public abstract void method130(int arg0);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIII)V")
    public abstract void method131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lnc;)V")
    public abstract void method132(class18 arg0);
}
