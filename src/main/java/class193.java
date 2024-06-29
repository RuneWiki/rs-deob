import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class193 extends class70 {
   @OriginalMember(
      owner = "client!lca",
      name = "I",
      descriptor = "I"
   )
   private int field2997 = 2048;
   @OriginalMember(
      owner = "client!lca",
      name = "T",
      descriptor = "I"
   )
   private int field2993 = 0;
   @OriginalMember(
      owner = "client!lca",
      name = "G",
      descriptor = "I"
   )
   private int field3002 = 10;
   @OriginalMember(
      owner = "client!lca",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3003 = new String[]{method1716(method1715("YxF\u001c,\u001d")), method1716(method1715("YxF\u001c)\u001d")), method1716(method1715("YxF\u001c.\u001d")), method1716(method1715("[nK^")), method1716(method1715("N5\t\u001c\u0012")), method1716(method1715("YxF\u001c*\u001d")), method1716(method1715("YxF\u001c-\u001d")), method1716(method1715("YxF\u001c'\u001d")), method1716(method1715("YxF\u001c+\u001d"))};
   @OriginalMember(
      owner = "client!lca",
      name = "Q",
      descriptor = "I"
   )
   public static int field2990 = 0;
   @OriginalMember(
      owner = "client!lca",
      name = "R",
      descriptor = "D"
   )
   public static double field2989;
   @OriginalMember(
      owner = "client!lca",
      name = "K",
      descriptor = "I"
   )
   public static int field2991;
   @OriginalMember(
      owner = "client!lca",
      name = "P",
      descriptor = "I"
   )
   public static int field2992;
   @OriginalMember(
      owner = "client!lca",
      name = "S",
      descriptor = "I"
   )
   public static int field2995;
   @OriginalMember(
      owner = "client!lca",
      name = "L",
      descriptor = "I"
   )
   public static int field2998;
   @OriginalMember(
      owner = "client!lca",
      name = "J",
      descriptor = "I"
   )
   public static int field2999;
   @OriginalMember(
      owner = "client!lca",
      name = "M",
      descriptor = "I"
   )
   public static int field3000;
   @OriginalMember(
      owner = "client!lca",
      name = "N",
      descriptor = "I"
   )
   public static int field3001;
   @OriginalMember(
      owner = "client!lca",
      name = "O",
      descriptor = "[I"
   )
   private int[] field2994;
   @OriginalMember(
      owner = "client!lca",
      name = "F",
      descriptor = "[I"
   )
   private int[] field2996;

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label46: {
            label45: {
               label44: {
                  if (~arg1 != -1) {
                     if (~arg1 == -2) {
                        break label44;
                     }

                     if (arg1 != 2) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field3002 = arg2.method2855(arg0 + -31006);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field2997 = arg2.method2848(arg0 + -119);
               if (!var4) {
                  break label46;
               }
            }

            this.field2993 = arg2.method2855(-31007);
         }

         ++field3000;
         if (arg0 != -1) {
            this.field2994 = null;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field3003[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3003[4] : field3003[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method1711(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lca",
      name = "<init>",
      descriptor = "()V"
   )
   public class193() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!lca",
      name = "b",
      descriptor = "(ZII)I"
   )
   public static final int method1712(boolean arg0, int arg1, int arg2) {
      try {
         ++field2999;
         if (~arg2 != -2 && ~arg2 != -4) {
            if (arg0) {
               method1712(true, 5, 67);
            }

            return class332.field5029[3 & arg1];
         } else {
            return class228.field3510[arg1 & 3];
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3003[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(Ljava/lang/String;II)I"
   )
   public static final int method1713(String arg0, int arg1, int arg2) {
      try {
         if (arg2 <= 0) {
            return 27;
         } else {
            ++field2998;
            return class367.method3001(-25122, true, arg1, arg0);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3003[2] + (arg0 != null ? field3003[4] : field3003[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method1714(int arg0) {
      boolean var1 = client.field1786;

      try {
         if (arg0 != -16243) {
            method1712(false, 93, 17);
         }

         ++field3001;
         int var2 = 0;
         if (var1 || var2 < class465.field7069) {
            do {
               class760 var3 = class207.field3159[var2];
               if (var3.field11241 == 3) {
                  if (var3.field11236 != null) {
                     class426.field6579.method4704(var3.field11236);
                     if (var1) {
                        var3.field11232 = Integer.MIN_VALUE;
                        ++var2;
                     } else {
                        ++var2;
                     }
                  } else {
                     var3.field11232 = Integer.MIN_VALUE;
                     ++var2;
                  }
               } else {
                  ++var2;
               }
            } while(var2 < class465.field7069);

         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3003[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method275(boolean arg0) {
      try {
         ++field2995;
         if (!arg0) {
            this.method1711((byte)-117);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3003[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1715(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1716(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
