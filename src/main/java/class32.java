import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class class32 {

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[[B")
    public static byte[][] field405 = new byte[250][];

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field406 = 0;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Ljava/lang/String;")
    public static String field408;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lna;ILhb;I)V", line = 15)
    public static final void method225(class26 arg0, int arg1, class35 arg2, int arg3) {
        field407++;
        class282 var4 = new class282();
        var4.field4356 = arg2.method273(65280);
        var4.field4353 = arg2.method299(-77);
        var4.field4365 = new int[var4.field4356];
        var4.field4366 = new class233[var4.field4356];
        var4.field4363 = new class233[var4.field4356];
        var4.field4358 = new int[var4.field4356];
        var4.field4362 = new int[var4.field4356];
        var4.field4359 = new byte[var4.field4356][][];
        if (arg1 >= -70) {
            return;
        }
        for (int var5 = 0; var5 < var4.field4356; var5++) {
            try {
                int var6 = arg2.method273(65280);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg2.method279(18);
                    int var18 = 0;
                    String var19 = arg2.method279(67);
                    if (var6 == 1) {
                        var18 = arg2.method299(-122);
                    }
                    var4.field4362[var5] = var6;
                    var4.field4365[var5] = var18;
                    var4.field4363[var5] = arg0.method161(class257.method1787(3, var17), var19, (byte) -13);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method279(18);
                    String var8 = arg2.method279(119);
                    int var9 = arg2.method273(65280);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method279(70);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method299(-73);
                            var12[var13] = new byte[var14];
                            arg2.method275(false, var12[var13], var14, 0);
                        }
                    }
                    var4.field4362[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class257.method1787(3, var10[var16]);
                    }
                    var4.field4366[var5] = arg0.method178(0, var15, class257.method1787(3, var7), var8);
                    var4.field4359[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field4358[var5] = -1;
            } catch (SecurityException var26) {
                var4.field4358[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field4358[var5] = -3;
            } catch (Exception var28) {
                var4.field4358[var5] = -4;
            } catch (Throwable var29) {
                var4.field4358[var5] = -5;
            }
        }
        class16.field182.method977(4, var4);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)Lv;", line = 129)
    public static final class73 method226(int arg0, int arg1) {
        class73 var2 = (class73) class126.field1991.method1432((byte) 112, (long) arg1);
        field403++;
        if (arg0 != 3724) {
            return (class73) null;
        } else if (var2 == null) {
            byte[] var3 = class97.field1444.method1507(arg1, (byte) -126, 34);
            class73 var4 = new class73();
            if (var3 != null) {
                var4.method601(new class35(var3), arg1, -88);
            }
            class126.field1991.method1436(false, var4, (long) arg1);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V", line = 152)
    public static final void method227(byte arg0) {
        field404++;
        if (arg0 < 107) {
            method227((byte) 53);
        }
        class3.field6 = true;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V", line = 167)
    public static void method228(byte arg0) {
        field405 = (byte[][]) null;
        field408 = null;
        if (arg0 < 55) {
            method225((class26) null, -5, (class35) null, 113);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[B")
    public abstract byte[] method222(int arg0, int arg1);

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)V")
    public abstract void method223(int arg0, int arg1);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Ltj;")
    public abstract class180 method224(byte arg0);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)I")
    public abstract int method229(int arg0, byte arg1);
}
