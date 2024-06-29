import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class667 {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lda;")
    public class59 field9491 = null;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lur;")
    public class535 field9494 = null;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field9492 = new String[200];

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Ldfa;")
    public static class165 field9490;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field9489;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Loh;ILha;)V", line = 5)
    public static final void method3791(class404 arg0, int arg1, class58 arg2) {
        field9493++;
        class155[] var3 = class155.method958(arg0, class418.field6080, 0);
        class675.field9562 = new class131[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class675.field9562[var4] = arg2.method434(var3[var4], true);
        }
        class155[] var5 = class155.method958(arg0, class222.field2552, 0);
        class198.field2334 = new class131[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class198.field2334[var6] = arg2.method434(var5[var6], true);
        }
        class155[] var7 = class155.method958(arg0, class270.field3335, 0);
        class163.field1825 = new class131[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class163.field1825[var8] = arg2.method434(var7[var8], true);
        }
        class155[] var9 = class155.method958(arg0, class683.field9666, 0);
        class485.field6896 = new class131[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class485.field6896[var10] = arg2.method434(var9[var10], true);
        }
        class155[] var11 = class155.method958(arg0, class745.field10408, 0);
        class153.field1689 = new class131[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class153.field1689[var12] = arg2.method434(var11[var12], true);
        }
        class155[] var13 = class155.method958(arg0, class449.field6487, 0);
        class255.field3121 = new class131[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class255.field3121[var14] = arg2.method434(var13[var14], true);
        }
        class155[] var15 = class155.method958(arg0, class148.field1645, 0);
        class207.field2436 = new class131[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class207.field2436[var16] = arg2.method434(var15[var16], true);
        }
        class155[] var17 = class155.method958(arg0, class354.field4543, 0);
        class411.field5616 = new class131[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class411.field5616[var18] = arg2.method434(var17[var18], true);
        }
        class155[] var19 = class155.method958(arg0, class711.field10017, 0);
        class568.field8080 = new class131[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class568.field8080[var20] = arg2.method434(var19[var20], true);
        }
        class155[] var21 = class155.method958(arg0, class603.field8586, 0);
        class1.field7 = new class131[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class1.field7[var22] = arg2.method434(var21[var22], true);
        }
        class155[] var23 = class155.method958(arg0, class645.field9218, 0);
        class374.field4814 = new class131[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class374.field4814[var24] = arg2.method434(var23[var24], true);
        }
        class155[] var25 = class155.method958(arg0, class322.field4115, 0);
        class323.field4118 = new class131[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class323.field4118[var26] = arg2.method434(var25[var26], true);
        }
        class451.field6505 = arg2.method434(class155.method953(arg0, class119.field1234, 0), true);
        class542.field7795 = arg2.method434(class155.method953(arg0, class753.field10526, 0), true);
        class155[] var27 = class155.method958(arg0, class280.field3433, 0);
        class511.field7292 = new class131[var27.length];
        for (int var28 = arg1; var28 < var27.length; var28++) {
            class511.field7292[var28] = arg2.method434(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 139)
    public static void method3792(byte arg0) {
        field9489 = null;
        field9490 = null;
        field9492 = null;
        int var1 = -102 % ((-arg0 - 42) / 42);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lda;)V", line = 157)
    public class667(class59 arg0) {
        this.field9491 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lda;Lur;)V", line = 164)
    public class667(class59 arg0, class535 arg1) {
        this.field9491 = arg0;
        this.field9494 = arg1;
    }
}
