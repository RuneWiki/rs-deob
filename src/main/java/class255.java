import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class255 extends class155 {

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "[B")
    public byte[] field4318;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "[I")
    public static int[] field4317 = new int[32];

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "(I)V")
    public static void method1839(int arg0) {
        if (arg0 != -1) {
            method1840(117, 5);
        }
        field4317 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)V")
    public static final void method1840(int arg0, int arg1) {
        field4319++;
        if (arg0 != -1) {
            field4317 = null;
        }
        class45.field703.method98(1, arg1);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Luf;I)V")
    public static final void method1841(class46 arg0, int arg1) {
        field4316++;
        arg0.field789 = false;
        if (arg0.field782 != -1) {
            class163 var2 = class34.method211(arg0.field782, arg1 ^ 0x2);
            if (var2 == null || var2.field2639 == null) {
                arg0.field782 = -1;
            } else {
                arg0.field738++;
                if (arg0.field756 < var2.field2639.length && arg0.field738 > var2.field2638[arg0.field756]) {
                    arg0.field763++;
                    arg0.field756++;
                    arg0.field738 = 1;
                    class131.method980(class16.field314 == arg0, arg0.field771, arg0.field715, arg0.field756, (byte) -94, var2);
                }
                if (var2.field2639.length <= arg0.field756) {
                    arg0.field738 = 0;
                    arg0.field756 = 0;
                    class131.method980(class16.field314 == arg0, arg0.field771, arg0.field715, arg0.field756, (byte) -120, var2);
                }
                arg0.field763 = arg0.field756 + 1;
                if (arg0.field763 >= var2.field2639.length) {
                    arg0.field763 = 0;
                }
            }
        }
        if (arg0.field757 != -1 && class275.field4598 >= arg0.field751) {
            class84 var3 = class258.method1847(arg1 ^ 0xFFFFFF8D, arg0.field757);
            int var4 = var3.field1404;
            if (var4 == -1) {
                arg0.field757 = -1;
            } else {
                label294: {
                    class163 var5 = class34.method211(var4, 3);
                    if (var3.field1409) {
                        if (var5.field2663 == 3) {
                            if (arg0.field755 > 0 && arg0.field765 <= class275.field4598 && class275.field4598 > arg0.field708) {
                                arg0.field757 = -1;
                                break label294;
                            }
                        } else if (var5.field2663 == 1 && arg0.field755 > 0 && arg0.field765 <= class275.field4598 && arg0.field708 < class275.field4598) {
                            arg0.field751 = class275.field4598 + 1;
                            break label294;
                        }
                    }
                    if (var5 == null || var5.field2639 == null) {
                        arg0.field757 = -1;
                    } else {
                        if (arg0.field747 < 0) {
                            arg0.field747 = 0;
                            class131.method980(class16.field314 == arg0, arg0.field771, arg0.field715, 0, (byte) -74, var5);
                        }
                        arg0.field767++;
                        if (arg0.field747 < var5.field2639.length && arg0.field767 > var5.field2638[arg0.field747]) {
                            arg0.field767 = 1;
                            arg0.field747++;
                            class131.method980(class16.field314 == arg0, arg0.field771, arg0.field715, arg0.field747, (byte) -97, var5);
                        }
                        if (arg0.field747 >= var5.field2639.length) {
                            if (var3.field1409) {
                                arg0.field747 -= var5.field2637;
                                arg0.field736++;
                                if (var5.field2646 <= arg0.field736) {
                                    arg0.field757 = -1;
                                } else if (arg0.field747 >= 0 && arg0.field747 < var5.field2639.length) {
                                    class131.method980(class16.field314 == arg0, arg0.field771, arg0.field715, arg0.field747, (byte) -120, var5);
                                } else {
                                    arg0.field757 = -1;
                                }
                            } else {
                                arg0.field757 = -1;
                            }
                        }
                        arg0.field742 = arg0.field747 + 1;
                        if (arg0.field742 >= var5.field2639.length) {
                            if (var3.field1409) {
                                arg0.field742 -= var5.field2637;
                                if (var5.field2646 <= arg0.field736 + 1) {
                                    arg0.field742 = -1;
                                } else if (arg0.field742 < 0 || arg0.field742 >= var5.field2639.length) {
                                    arg0.field742 = -1;
                                }
                            } else {
                                arg0.field742 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field761 != -1 && arg0.field791 <= 1) {
            class163 var6 = class34.method211(arg0.field761, 3);
            if (var6.field2663 == 3) {
                if (arg0.field755 > 0 && arg0.field765 <= class275.field4598 && arg0.field708 < class275.field4598) {
                    arg0.field761 = -1;
                }
            } else if (var6.field2663 == 1 && arg0.field755 > 0 && arg0.field765 <= class275.field4598 && arg0.field708 < class275.field4598) {
                arg0.field791 = 2;
            }
        }
        if (arg0.field761 != -1 && arg0.field791 == 0) {
            class163 var7 = class34.method211(arg0.field761, 3);
            if (var7 == null || var7.field2639 == null) {
                arg0.field761 = -1;
            } else {
                arg0.field784++;
                if (arg0.field719 < var7.field2639.length && arg0.field784 > var7.field2638[arg0.field719]) {
                    arg0.field784 = 1;
                    arg0.field719++;
                    class131.method980(class16.field314 == arg0, arg0.field771, arg0.field715, arg0.field719, (byte) -110, var7);
                }
                if (arg0.field719 >= var7.field2639.length) {
                    arg0.field719 -= var7.field2637;
                    arg0.field804++;
                    if (arg0.field804 >= var7.field2646) {
                        arg0.field761 = -1;
                    } else if (arg0.field719 >= 0 && arg0.field719 < var7.field2639.length) {
                        class131.method980(class16.field314 == arg0, arg0.field771, arg0.field715, arg0.field719, (byte) -109, var7);
                    } else {
                        arg0.field761 = -1;
                    }
                }
                arg0.field731 = arg0.field719 + 1;
                if (var7.field2639.length <= arg0.field731) {
                    arg0.field731 -= var7.field2637;
                    if (var7.field2646 <= (arg0.field804 + 1)) {
                        arg0.field731 = -1;
                    } else if (arg0.field731 < 0 || arg0.field731 >= var7.field2639.length) {
                        arg0.field731 = -1;
                    }
                }
                arg0.field789 = var7.field2649;
            }
        }
        if (arg0.field791 > 0) {
            arg0.field791--;
        }
        if (arg1 != 1) {
            field4317 = null;
        }
        for (int var8 = 0; var8 < arg0.field799.length; var8++) {
            class313 var9 = arg0.field799[var8];
            if (var9 != null) {
                if (var9.field5034 > 0) {
                    var9.field5034--;
                } else {
                    class163 var10 = class34.method211(var9.field5040, 3);
                    if (var10 == null || var10.field2639 == null) {
                        arg0.field799[var8] = null;
                    } else {
                        var9.field5052++;
                        if (var9.field5051 < var10.field2639.length && var10.field2638[var9.field5051] < var9.field5052) {
                            var9.field5052 = 1;
                            var9.field5051++;
                            class131.method980(class16.field314 == arg0, arg0.field771, arg0.field715, var9.field5051, (byte) -124, var10);
                        }
                        if (var9.field5051 >= var10.field2639.length) {
                            var9.field5051 -= var10.field2637;
                            var9.field5053++;
                            if (var9.field5053 >= var10.field2646) {
                                arg0.field799[var8] = null;
                            } else if (var9.field5051 >= 0 && var10.field2639.length > var9.field5051) {
                                class131.method980(class16.field314 == arg0, arg0.field771, arg0.field715, var9.field5051, (byte) -128, var10);
                            } else {
                                arg0.field799[var8] = null;
                            }
                        }
                        var9.field5045 = var9.field5051 + 1;
                        if (var9.field5045 >= var10.field2639.length) {
                            var9.field5045 -= var10.field2637;
                            if (var9.field5053 + 1 >= var10.field2646) {
                                var9.field5045 = -1;
                            } else if (var9.field5045 < 0 || var9.field5045 >= var10.field2639.length) {
                                var9.field5045 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "([B)V")
    public class255(byte[] arg0) {
        this.field4318 = arg0;
    }
}
