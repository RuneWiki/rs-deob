import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class309 implements class141 {
   @OriginalMember(
      owner = "client!sq",
      name = "f",
      descriptor = "Lld;"
   )
   private class164 field4814;
   @OriginalMember(
      owner = "client!sq",
      name = "c",
      descriptor = "I"
   )
   public int field4809;
   @OriginalMember(
      owner = "client!sq",
      name = "e",
      descriptor = "[I"
   )
   public int[] field4815;
   @OriginalMember(
      owner = "client!sq",
      name = "l",
      descriptor = "I"
   )
   public int field4807;
   @OriginalMember(
      owner = "client!sq",
      name = "h",
      descriptor = "Lug;"
   )
   private class5 field4817;
   @OriginalMember(
      owner = "client!sq",
      name = "i",
      descriptor = "[F"
   )
   public float[] field4816;
   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4818 = new String[]{method2591(method2590("+JP\u0019k")), method2591(method2590("+JP\u001ek")), method2591(method2590("+JP\u001fk")), method2591(method2590("6N\u00121")), method2591(method2590("+JPa*6R\nck")), method2591(method2590("#\u0015Ps>")), method2591(method2590("+JP\u0018k")), method2591(method2590("+JP\u001ck"))};
   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field4806 = new int[]{2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0};
   @OriginalMember(
      owner = "client!sq",
      name = "g",
      descriptor = "[[I"
   )
   public static int[][] field4811 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12, 12, 5}, {5, 5, 1, 1}, {5, 1, 1, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 12, 12, 12, 12, 12}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 3, 1, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 7, 3, 7}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!sq",
      name = "k",
      descriptor = "I"
   )
   public static int field4808;
   @OriginalMember(
      owner = "client!sq",
      name = "d",
      descriptor = "I"
   )
   public static int field4810;
   @OriginalMember(
      owner = "client!sq",
      name = "b",
      descriptor = "I"
   )
   public static int field4812;
   @OriginalMember(
      owner = "client!sq",
      name = "j",
      descriptor = "I"
   )
   public static int field4813;

   @OriginalMember(
      owner = "client!sq",
      name = "b",
      descriptor = "(IIIIIIZZ)V",
      line = 7
   )
   public final void method1288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         class626.method4591(this.field4814.field2454.field3084, arg0, -118, arg2, !arg7 ? null : this.field4816, arg5, arg1, !arg6 ? null : this.field4815, arg7 ? this.field4814.field2496 : null, this.field4809, arg4, this.field4814.field2454.field3088, arg3);
         ++field4813;
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field4818[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(IBI)Z",
      line = 18
   )
   public static final boolean method2587(int arg0, byte arg1, int arg2) {
      try {
         int var3 = -80 % ((-18 - arg1) / 40);
         ++field4808;
         return (33 & arg2) != 0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4818[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(IIIIIIZZ)V",
      line = 35
   )
   public final void method1289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         class626.method4591(this.field4809, arg0, -128, arg2, !arg7 ? null : this.field4814.field2496, arg5, arg1, !arg6 ? null : this.field4814.field2454.field3088, arg7 ? this.field4816 : null, this.field4814.field2454.field3084, arg4, this.field4815, arg3);
         ++field4810;
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field4818[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "b",
      descriptor = "(I)V",
      line = 51
   )
   public static void method2588(int arg0) {
      try {
         field4811 = null;
         if (arg0 != 5) {
            field4811 = null;
         }

         field4806 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4818[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "a",
      descriptor = "(I)V",
      line = 63
   )
   public static final void method2589(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field4812;
         if (class463.field7035 != null) {
            int var2 = 0;
            if (var1) {
               class463.field7035[var2] = null;
               ++var2;
            }

            while(true) {
               while(~var2 > ~class410.field6383) {
                  class463.field7035[var2] = null;
                  ++var2;
               }

               if (!var1) {
                  class463.field7035 = null;
                  break;
               }

               ++var2;
            }
         }

         if (class681.field10157 != null) {
            int var3 = 0;
            if (var1) {
               class681.field10157[var3] = null;
               ++var3;
            }

            while(true) {
               while(var3 < class292.field4635) {
                  class681.field10157[var3] = null;
                  ++var3;
               }

               if (!var1) {
                  class681.field10157 = null;
                  break;
               }

               ++var3;
            }
         }

         if (class293.field4646 != null) {
            int var4 = 0;
            if (var1) {
               class293.field4646[var4] = null;
               ++var4;
            }

            while(true) {
               while(~class711.field10691 < ~var4) {
                  class293.field4646[var4] = null;
                  ++var4;
               }

               if (!var1) {
                  class293.field4646 = null;
                  break;
               }

               ++var4;
            }
         }

         if (arg0 > -94) {
            method2588(-70);
         }

         class590.field8696 = null;
         class366.field5665 = null;
         class105.field1456 = -1;
         class211.field3196 = -1;
         class327.field4984 = null;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4818[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "<init>",
      descriptor = "(Lld;Ljq;Lug;)V",
      line = 116
   )
   public class309(class164 arg0, class672 arg1, class5 arg2) {
      boolean var4 = client.field1786;
      super();

      try {
         label59: {
            this.field4814 = arg0;
            if (arg1 instanceof class468) {
               class468 var5 = (class468)arg1;
               this.field4809 = var5.field7866;
               this.field4815 = var5.field7114;
               this.field4807 = var5.field7861;
               if (!var4) {
                  break label59;
               }
            }

            if (!(arg1 instanceof class94)) {
               throw new RuntimeException();
            }

            class94 var6 = (class94)arg1;
            this.field4809 = var6.field7866;
            this.field4815 = var6.field1333;
            this.field4807 = var6.field7861;
            if (var4) {
               throw new RuntimeException();
            }
         }

         if (arg2 != null) {
            this.field4817 = arg2;
            if (~this.field4817.field26 == ~this.field4809 && this.field4817.field30 == this.field4807) {
               this.field4816 = this.field4817.field25;
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4818[4] + (arg0 != null ? field4818[5] : field4818[3]) + ',' + (arg1 != null ? field4818[5] : field4818[3]) + ',' + (arg2 != null ? field4818[5] : field4818[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2590(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2591(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
