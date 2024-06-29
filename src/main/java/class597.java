import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class597 extends class213 {
   @OriginalMember(
      owner = "client!qi",
      name = "G",
      descriptor = "[S"
   )
   private short[] field8312 = new short[257];
   @OriginalMember(
      owner = "client!qi",
      name = "M",
      descriptor = "I"
   )
   private int field8319 = 0;
   @OriginalMember(
      owner = "client!qi",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8323 = new String[]{method4361(method4360("Jz\u0003;9")), method4361(method4360("Jz\u000399")), method4361(method4360("Jz\u000309")), method4361(method4360("xf_\u000et\u001b|]\u001dcZgD\u0017\u007f\u001baH\tdRaH\u000b1Zg\r\u0014tZ`YXeL|\r\u0015pIxH\nb")), method4361(method4360("Jz\u000339")), method4361(method4360("Jz\u0003<9")), method4361(method4360("Jz\u0003>9")), method4361(method4360("H{B\u000fGRwH\u0017P_")), method4361(method4360("UfA\u0014")), method4361(method4360("@=\u0003Vl")), method4361(method4360("Jz\u0003=9")), method4361(method4360("Jz\u0003:9")), method4361(method4360("Jz\u0003?9")), method4361(method4360("Jz\u000319"))};
   @OriginalMember(
      owner = "client!qi",
      name = "R",
      descriptor = "I"
   )
   public static int field8305 = 0;
   @OriginalMember(
      owner = "client!qi",
      name = "E",
      descriptor = "I"
   )
   public static int field8310 = 0;
   @OriginalMember(
      owner = "client!qi",
      name = "U",
      descriptor = "Z"
   )
   public static boolean field8320 = false;
   @OriginalMember(
      owner = "client!qi",
      name = "J",
      descriptor = "I"
   )
   public static int field8304;
   @OriginalMember(
      owner = "client!qi",
      name = "P",
      descriptor = "I"
   )
   public static int field8307;
   @OriginalMember(
      owner = "client!qi",
      name = "V",
      descriptor = "I"
   )
   public static int field8308;
   @OriginalMember(
      owner = "client!qi",
      name = "L",
      descriptor = "I"
   )
   public static int field8309;
   @OriginalMember(
      owner = "client!qi",
      name = "F",
      descriptor = "I"
   )
   public static int field8311;
   @OriginalMember(
      owner = "client!qi",
      name = "H",
      descriptor = "I"
   )
   public static int field8313;
   @OriginalMember(
      owner = "client!qi",
      name = "D",
      descriptor = "I"
   )
   public static int field8316;
   @OriginalMember(
      owner = "client!qi",
      name = "O",
      descriptor = "I"
   )
   public static int field8317;
   @OriginalMember(
      owner = "client!qi",
      name = "Q",
      descriptor = "I"
   )
   public static int field8318;
   @OriginalMember(
      owner = "client!qi",
      name = "S",
      descriptor = "I"
   )
   public static int field8321;
   @OriginalMember(
      owner = "client!qi",
      name = "I",
      descriptor = "I"
   )
   public static int field8322;
   @OriginalMember(
      owner = "client!qi",
      name = "W",
      descriptor = "[I"
   )
   private int[] field8306;
   @OriginalMember(
      owner = "client!qi",
      name = "T",
      descriptor = "[I"
   )
   private int[] field8314;
   @OriginalMember(
      owner = "client!qi",
      name = "K",
      descriptor = "[[I"
   )
   private int[][] field8315;

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(Ljava/lang/String;CLjava/lang/String;I)Ljava/lang/String;"
   )
   public static final String method4353(String arg0, char arg1, String arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         ++field8321;
         int var5 = arg0.length();
         int var6 = arg2.length();
         int var7 = var5;
         int var8 = var6 + -1;
         if (arg3 != 19716) {
            return null;
         } else {
            if (~var8 != -1) {
               int var9 = 0;

               do {
                  var9 = arg0.indexOf(arg1, var9);
                  if (var9 < 0) {
                     break;
                  }

                  ++var9;
                  var7 += var8;
               } while(!var4);
            }

            StringBuffer var10 = new StringBuffer(var7);
            int var11 = 0;

            while(true) {
               int var12 = arg0.indexOf(arg1, var11);
               if (~var12 <= -1) {
                  var10.append(arg0.substring(var11, var12));
                  var10.append(arg2);
                  var11 = var12 + 1;
                  if (var4) {
                     break;
                  }

                  if (!var4) {
                     continue;
                  }
               }

               var10.append(arg0.substring(var11));
               break;
            }

            return var10.toString();
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field8323[10] + (arg0 != null ? field8323[9] : field8323[8]) + ',' + arg1 + ',' + (arg2 != null ? field8323[9] : field8323[8]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1457(int arg0) {
      try {
         if (this.field8315 == null) {
            this.field8315 = new int[][]{new int[2], {4096, 4096}};
         }

         ++field8308;
         if (this.field8315.length < 2) {
            throw new RuntimeException(field8323[3]);
         } else {
            if (this.field8319 == 2) {
               this.method4356(100);
            }

            if (arg0 != 28274) {
               field8310 = 18;
            }

            class39.method296((byte)56);
            this.method4355(-93);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8323[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "c",
      descriptor = "(II)V"
   )
   public static final void method4354(int arg0, int arg1) {
      try {
         class701.field10210 = arg0;
         class595.field8288 = arg1;
         ++field8307;
         class730.field10685 = 100;
         class367.field5175 = -1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8323[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "<init>",
      descriptor = "()V"
   )
   public class597() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!qi",
      name = "g",
      descriptor = "(I)V"
   )
   private final void method4355(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 != 2064866508) {
            field8320 = true;
         }

         ++field8322;
         int[] var4 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
            int[] var5 = this.method1619((byte)37, arg0, 0);
            int var6 = 0;
            if (var3 || ~var6 > ~class576.field7916) {
               do {
                  int var7 = var5[var6] >> 4;
                  if (~var7 > -1) {
                     var7 = 0;
                  }

                  if (var7 > 256) {
                     var7 = 256;
                  }

                  var4[var6] = this.field8312[var7];
                  ++var6;
               } while(~var6 > ~class576.field7916);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field8323[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "h",
      descriptor = "(I)V"
   )
   private final void method4356(int arg0) {
      try {
         ++field8309;
         int[] var2 = this.field8315[0];
         int[] var3 = this.field8315[1];
         if (arg0 != 100) {
            this.field8315 = null;
         }

         int[] var4 = this.field8315[this.field8315.length + -2];
         int[] var5 = this.field8315[this.field8315.length + -1];
         this.field8314 = new int[]{var2[0] + -var3[0] + var2[0], var2[1] + -var3[1] + var2[1]};
         this.field8306 = new int[]{var4[0] + -var5[0] + var4[0], var4[1] + var4[1] + -var5[1]};
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field8323[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "(B)Z"
   )
   public static final boolean method4357(byte arg0) {
      try {
         ++field8317;
         if (class710.field10422) {
            try {
               class164.method1307(-22955, class126.field1586, field8323[7]);
               return true;
            } catch (Throwable var2) {
            }
         }

         return arg0 <= 124;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8323[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "(III)V"
   )
   public static final void method4358(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 27218) {
            field8310 = 5;
         }

         ++field8313;
         if (class381.field5334 != class339.field4866) {
            if (!class280.method2134(false, arg0, 0, 1, -103, 1, 0, arg2, -3)) {
               class280.method2134(false, arg0, 0, 1, arg1 ^ 27184, 1, 0, arg2, -2);
            }
         } else if (!class280.method2134(false, arg0, 0, 1, 94, 1, 0, arg2, -2)) {
            class280.method2134(false, arg0, 0, 1, -114, 1, 0, arg2, -3);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8323[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "(II)[I"
   )
   private final int[] method4359(int arg0, int arg1) {
      try {
         ++field8318;
         if (arg0 < 0) {
            return this.field8314;
         } else if (this.field8315.length <= arg0) {
            return this.field8306;
         } else {
            if (arg1 > -26) {
               this.method4356(-39);
            }

            return this.field8315[arg0];
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8323[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4360(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4361(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
