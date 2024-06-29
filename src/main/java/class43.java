import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class43 extends class60 {

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public int field682 = -1;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    public int field685 = 0;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Laj;Lbk;II)V", line = 11)
    public static final void method384(class1 arg0, class69 arg1, int arg2, int arg3) {
        field690++;
        class310 var4 = new class310();
        var4.field4904 = arg0.method15((byte) 83);
        var4.field4907 = arg0.method33(false);
        var4.field4902 = new int[var4.field4904];
        var4.field4908 = new int[var4.field4904];
        var4.field4903 = new byte[var4.field4904][][];
        var4.field4909 = new class23[var4.field4904];
        var4.field4905 = new class23[var4.field4904];
        var4.field4896 = new int[var4.field4904];
        for (int var5 = 0; var5 < var4.field4904; var5++) {
            try {
                int var6 = arg0.method15((byte) -104);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg0.method53(arg3 - 7062);
                    int var18 = 0;
                    String var19 = arg0.method53(32);
                    if (var6 == 1) {
                        var18 = arg0.method33(false);
                    }
                    var4.field4908[var5] = var6;
                    var4.field4896[var5] = var18;
                    var4.field4905[var5] = arg1.method552(var19, -118, class245.method1728(true, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg0.method53(arg3 ^ 0x1B96);
                    String var8 = arg0.method53(32);
                    int var9 = arg0.method15((byte) -35);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg0.method53(32);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method33(false);
                            var12[var13] = new byte[var14];
                            arg0.method20(var12[var13], 0, (byte) 58, var14);
                        }
                    }
                    var4.field4908[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class245.method1728(true, var10[var16]);
                    }
                    var4.field4909[var5] = arg1.method562(class245.method1728(true, var7), var8, -97, var15);
                    var4.field4903[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field4902[var5] = -1;
            } catch (SecurityException var26) {
                var4.field4902[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field4902[var5] = -3;
            } catch (Exception var28) {
                var4.field4902[var5] = -4;
            } catch (Throwable var29) {
                var4.field4902[var5] = -5;
            }
        }
        if (arg3 != 7094) {
            method385(14);
        }
        class288.field4508.method277(var4, (byte) -119);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 125)
    public static final void method385(int arg0) {
        int var1 = -10 % ((arg0 - 11) / 55);
        field675++;
        if (!class53.method450(2) && class75.field1153 != class310.field4900) {
            class154.method1150(class75.field1153, false, false, class211.field3316, (byte) 116, client.field4119, class345.field5363.field4619[0], class345.field5363.field4643[0]);
        } else if (class75.field1153 != class122.field1987 && class152.method1144(15673, class75.field1153)) {
            class122.field1987 = class75.field1153;
            class99.method799(106);
        }
    }
}
