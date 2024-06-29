import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class class434 extends class430 {

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field6221;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "[J")
    public static long[] field6216 = new long[256];

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "[I")
    public static int[] field6218 = new int[4];

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "[F")
    public static float[] field6220 = new float[4];

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public int field6217;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "Lraa;")
    public static class353 field6215;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "()V")
    public static final void method2665() {
        if (class386.field5587 != null) {
            for (int var0 = 0; var0 < class386.field5587.length; var0++) {
                for (int var1 = 0; var1 < class439.field6264; var1++) {
                    for (int var2 = 0; var2 < class408.field5806; var2++) {
                        if (class386.field5587[var0][var1][var2] != null) {
                            class386.field5587[var0][var1][var2].method2326(-127);
                        }
                        class386.field5587[var0][var1][var2] = null;
                    }
                }
            }
        }
        class386.field5587 = null;
        class491.field7079 = null;
        if (class643.field9177 != null) {
            for (int var3 = 0; var3 < class643.field9177.length; var3++) {
                for (int var4 = 0; var4 < class439.field6264; var4++) {
                    for (int var5 = 0; var5 < class408.field5806; var5++) {
                        if (class643.field9177[var3][var4][var5] != null) {
                            class643.field9177[var3][var4][var5].method2326(-127);
                        }
                        class643.field9177[var3][var4][var5] = null;
                    }
                }
            }
        }
        class643.field9177 = null;
        class25.field221 = null;
        class565.field8185 = null;
        class95.field1372 = null;
        class437.field6237 = null;
        class402.field5754 = null;
        class624.field8879 = null;
        class35.field315 = null;
        class174.field2449 = null;
        class261.method1729((byte) 85);
        if (class356.field5256 != null) {
            for (int var6 = 0; var6 < class594.field8445; var6++) {
                class356.field5256[var6] = null;
            }
            class594.field8445 = 0;
        }
        if (class132.field1818 != null) {
            for (int var7 = 0; var7 < class355.field5248[0]; var7++) {
                class132.field1818[0][var7] = null;
            }
            for (int var8 = 0; var8 < class355.field5248[1]; var8++) {
                class132.field1818[1][var8] = null;
            }
            class355.field5248 = new int[2];
        }
        if (class499.field7174 != null) {
            for (int var9 = 0; var9 < class575.field8273[0]; var9++) {
                class499.field7174[0][var9] = null;
            }
            for (int var10 = 0; var10 < class575.field8273[1]; var10++) {
                class499.field7174[1][var10] = null;
            }
            class575.field8273 = new int[2];
        }
        if (class399.field5714 != null) {
            for (int var11 = 0; var11 < class145.field1963[0]; var11++) {
                class399.field5714[0][var11] = null;
            }
            for (int var12 = 0; var12 < class145.field1963[1]; var12++) {
                class399.field5714[1][var12] = null;
            }
            class145.field1963 = new int[2];
        }
        if (class386.field5582 != null) {
            for (int var13 = 0; var13 < class386.field5582.length; var13++) {
                class386.field5582[var13] = null;
            }
            class423.field6033 = 0;
        }
        if (class393.field5647 != null) {
            for (int var14 = 0; var14 < class393.field5647.length; var14++) {
                class393.field5647[var14] = null;
            }
            class610.field8707 = 0;
        }
        if (class62.field1000 != null) {
            for (int var15 = 0; var15 < class5.field56; var15++) {
                class62.field1000[var15] = null;
            }
            for (int var16 = 0; var16 < class433.field6202; var16++) {
                for (int var17 = 0; var17 < class439.field6264; var17++) {
                    for (int var18 = 0; var18 < class408.field5806; var18++) {
                        class72.field1096[var16][var17][var18] = 0L;
                    }
                }
            }
            class5.field56 = 0;
        }
        class364.method2293(-83);
        class465.field6628 = class465.field6627;
        class465.field6628.method3855(false);
        class609.field8690 = null;
        class346.field4951 = null;
        class167.field2372 = null;
        if (class186.field2604 != null) {
            class113.method815();
            class391.field5644.method340(1);
            class391.field5644.method383(0);
        }
        if (class618.field8804 != null) {
            class618.field8804 = null;
        }
        class391.field5644 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public final void method2666(byte arg0, OggPacket arg1) {
        field6214++;
        int var3 = 72 % ((arg0 - 38) / 48);
        this.method143(arg1, true);
        this.field6217++;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public abstract void method138(int arg0);

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
    public static final void method2667(int arg0) {
        if (arg0 >= class514.field7446) {
            class683.field9700 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class445.field6360.length; var2++) {
                if (class445.field6360[var2].indexOf("--> ") != -1) {
                    var1++;
                    if (class514.field7446 == var1) {
                        class683.field9700 = class445.field6360[var2].substring(class445.field6360[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        }
        field6219++;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
    public static void method2668(byte arg0) {
        field6215 = null;
        field6218 = null;
        field6216 = null;
        if (arg0 < -8) {
            field6220 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class434(OggStreamState arg0) {
        this.field6221 = arg0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V")
    public abstract void method143(OggPacket arg0, boolean arg1);

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6216[var0] = var1;
        }
    }
}
