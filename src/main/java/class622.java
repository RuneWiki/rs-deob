import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class class622 extends class22 {
   @OriginalMember(
      owner = "client!ke",
      name = "t",
      descriptor = "I"
   )
   private int field9070;
   @OriginalMember(
      owner = "client!ke",
      name = "s",
      descriptor = "I"
   )
   public int field9066;
   @OriginalMember(
      owner = "client!ke",
      name = "o",
      descriptor = "I"
   )
   public int field9072;
   @OriginalMember(
      owner = "client!ke",
      name = "n",
      descriptor = "F"
   )
   public float field9076;
   @OriginalMember(
      owner = "client!ke",
      name = "l",
      descriptor = "I"
   )
   private int field9069;
   @OriginalMember(
      owner = "client!ke",
      name = "p",
      descriptor = "I"
   )
   public int field9064;
   @OriginalMember(
      owner = "client!ke",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9080 = new String[]{method4566(method4565("X\u001b\u0018x\u000f")), method4566(method4565("X\u001b\u0018~\u000f")), method4566(method4565("X\u001b\u0018\u007f\u000f")), method4566(method4565("\t^")), method4566(method4565("]\u000bZ\\")), method4566(method4565("X\u001b\u0018z\u000f")), method4566(method4565("HP\u0018\u001eZ")), method4566(method4565("X\u001b\u0018}\u000f")), method4566(method4565("X\u001b\u0018y\u000f")), method4566(method4565("X\u001b\u0018v\u000f")), method4566(method4565("X\u001b\u0018{\u000f")), method4566(method4565("X\u001b\u0018\fN]\u0017B\u000e\u000f")), method4566(method4565("X\u001b\u0018w\u000f")), method4566(method4565("X\u001b\u0018|\u000f"))};
   @OriginalMember(
      owner = "client!ke",
      name = "q",
      descriptor = "Luw;"
   )
   public static class435 field9075 = new class435(82, 2);
   @OriginalMember(
      owner = "client!ke",
      name = "A",
      descriptor = "Luw;"
   )
   public static class435 field9078 = new class435(58, 2);
   @OriginalMember(
      owner = "client!ke",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field9079 = new int[8];
   @OriginalMember(
      owner = "client!ke",
      name = "w",
      descriptor = "I"
   )
   public static int field9061;
   @OriginalMember(
      owner = "client!ke",
      name = "v",
      descriptor = "I"
   )
   public static int field9062;
   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "I"
   )
   public static int field9063;
   @OriginalMember(
      owner = "client!ke",
      name = "x",
      descriptor = "I"
   )
   public static int field9065;
   @OriginalMember(
      owner = "client!ke",
      name = "B",
      descriptor = "I"
   )
   public static int field9067;
   @OriginalMember(
      owner = "client!ke",
      name = "y",
      descriptor = "I"
   )
   public static int field9068;
   @OriginalMember(
      owner = "client!ke",
      name = "m",
      descriptor = "I"
   )
   public static int field9071;
   @OriginalMember(
      owner = "client!ke",
      name = "u",
      descriptor = "I"
   )
   public static int field9073;
   @OriginalMember(
      owner = "client!ke",
      name = "j",
      descriptor = "I"
   )
   public static int field9074;
   @OriginalMember(
      owner = "client!ke",
      name = "k",
      descriptor = "I"
   )
   public static int field9077;

   @OriginalMember(
      owner = "client!ke",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4555(byte arg0) {
      try {
         field9079 = null;
         if (arg0 > -57) {
            field9075 = null;
         }

         field9078 = null;
         field9075 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9080[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(FZ)V"
   )
   public abstract void method1812(float arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ke",
      name = "c",
      descriptor = "(B)F"
   )
   public final float method4556(byte arg0) {
      try {
         ++field9067;
         if (arg0 < 91) {
            this.field9076 = -1.1142746F;
         }

         return this.field9076;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9080[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method4557(byte arg0) {
      try {
         ++field9073;
         return arg0 >= -119 ? -13 : this.field9066;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9080[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4558(int arg0) {
      boolean var1 = client.field4564;

      try {
         label28: {
            ++field9065;
            if (class780.field11425 == null) {
               if (class733.field10535 != -1) {
                  class503.method3782(class475.field6939, 8);
                  if (!var1) {
                     break label28;
                  }
               }

               class779.method5634(class386.field5693, class741.field10672, class475.field6939, (byte)-70);
               if (!var1) {
                  break label28;
               }
            }

            class637.method4667(class475.field6939, (byte)15);
         }

         if (arg0 > -39) {
            method4558(-24);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9080[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(IIBI)V"
   )
   public abstract void method1814(int arg0, int arg1, byte arg2, int arg3);

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method4559(byte arg0) {
      try {
         int var2 = -102 / ((arg0 - 28) / 45);
         ++field9062;
         return this.field9070;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9080[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "e",
      descriptor = "(B)I"
   )
   public final int method4560(byte arg0) {
      try {
         ++field9068;
         if (arg0 < 66) {
            method4562(-37, 2);
         }

         return this.field9064;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9080[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public static final void method4561(String arg0, byte arg1) {
      boolean var2 = client.field4564;

      try {
         if (arg1 < 44) {
            field9075 = null;
         }

         if (class745.field10758 == null) {
            class373.method2918((byte)110);
         }

         ++field9074;
         class216.field3255.setTime(new Date(class57.method650(121)));
         int var3 = class216.field3255.get(11);
         int var4 = class216.field3255.get(12);
         int var5 = class216.field3255.get(13);
         String var6 = Integer.toString(var3 / 10) + var3 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10;
         String[] var7 = class431.method3250(true, arg0, '\n');
         int var8 = 0;
         if (var2 || var8 < var7.length) {
            do {
               int var9 = class333.field4766;
               if (var2) {
                  class745.field10758[var9] = class745.field10758[var9 - 1];
                  --var9;
               }

               while(true) {
                  while(~var9 < -1) {
                     class745.field10758[var9] = class745.field10758[var9 - 1];
                     --var9;
                  }

                  class745.field10758[0] = var6 + field9080[3] + var7[var8];
                  if (!var2) {
                     if (class495.field7248 != null) {
                        try {
                           class495.field7248.write(class335.method2603(-1129, class745.field10758[0] + "\n"));
                        } catch (IOException var11) {
                        }
                     }

                     if (class333.field4766 < class745.field10758.length - 1) {
                        if (~class279.field3924 < -1) {
                           ++class279.field3924;
                        }

                        ++class333.field4766;
                     }

                     ++var8;
                     break;
                  }

                  --var9;
               }
            } while(var8 < var7.length);

         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field9080[5] + (arg0 != null ? field9080[6] : field9080[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(II)[I"
   )
   public static final int[] method4562(int arg0, int arg1) {
      try {
         ++field9071;
         int[] var2 = new int[3];
         class62.method673(class126.method1227(arg0, false), (byte)34);
         var2[0] = class62.field1161.get(5);
         var2[1] = class62.field1161.get(2);
         var2[2] = class62.field1161.get(1);
         if (arg1 != -21179) {
            field9075 = null;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9080[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method4563(int arg0) {
      try {
         if (arg0 != 1) {
            field9077 = 25;
         }

         ++field9061;
         return this.field9072;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9080[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class622(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         this.field9070 = arg4;
         this.field9066 = arg2;
         this.field9072 = arg1;
         this.field9076 = arg5;
         this.field9069 = arg3;
         this.field9064 = arg0;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field9080[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "f",
      descriptor = "(B)I"
   )
   public final int method4564(byte arg0) {
      try {
         if (arg0 != -108) {
            return -91;
         } else {
            ++field9063;
            return this.field9069;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9080[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4565(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4566(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
