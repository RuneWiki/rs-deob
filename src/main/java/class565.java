import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class565 extends class184 {
   @OriginalMember(
      owner = "client!rc",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8062 = new String[]{method4031(method4030("F4\u00079")), method4031(method4030("SoE{*")), method4031(method4030("Z\"E\u0014\u007f")), method4031(method4030("Z\"E\u0016\u007f")), method4031(method4030("Z\"E\u0017\u007f")), method4031(method4030("Z\"E\u0010\u007f")), method4031(method4030("Z\"E\u0011\u007f"))};
   @OriginalMember(
      owner = "client!rc",
      name = "M",
      descriptor = "Leg;"
   )
   public static class118 field8053 = new class118(40, 0);
   @OriginalMember(
      owner = "client!rc",
      name = "P",
      descriptor = "[I"
   )
   public static int[] field8060 = new int[4];
   @OriginalMember(
      owner = "client!rc",
      name = "Q",
      descriptor = "B"
   )
   public byte field8058;
   @OriginalMember(
      owner = "client!rc",
      name = "N",
      descriptor = "F"
   )
   public static float field8055;
   @OriginalMember(
      owner = "client!rc",
      name = "G",
      descriptor = "I"
   )
   public static int field8052;
   @OriginalMember(
      owner = "client!rc",
      name = "I",
      descriptor = "I"
   )
   public static int field8054;
   @OriginalMember(
      owner = "client!rc",
      name = "K",
      descriptor = "I"
   )
   public static int field8056;
   @OriginalMember(
      owner = "client!rc",
      name = "O",
      descriptor = "I"
   )
   public static int field8057;
   @OriginalMember(
      owner = "client!rc",
      name = "L",
      descriptor = "I"
   )
   public int field8061;
   @OriginalMember(
      owner = "client!rc",
      name = "H",
      descriptor = "Lwf;"
   )
   public class147 field8059;

   @OriginalMember(
      owner = "client!rc",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method4027(byte arg0) {
      try {
         field8060 = null;
         int var1 = -29 / ((61 - arg0) / 48);
         field8053 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8062[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/io/File;)V"
   )
   public static final void method4028(int arg0, String arg1, File arg2) {
      try {
         class641.field9377.put(arg1, arg2);
         ++field8054;
         if (arg0 != 0) {
            method4029(-90, (byte[])null, -12, -23, -115, 35, -3);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8062[2] + arg0 + ',' + (arg1 != null ? field8062[1] : field8062[0]) + ',' + (arg2 != null ? field8062[1] : field8062[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(I[BIIIII)Z"
   )
   public static final boolean method4029(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4360;

      try {
         int var9;
         label92: {
            ++field8052;
            int var8 = arg2 % arg5;
            if (var8 == 0) {
               var9 = 0;
               if (!var7) {
                  break label92;
               }
            }

            var9 = arg5 - var8;
         }

         int var10 = -((arg4 + arg5 + -1) / arg5);
         if (arg6 != -7911) {
            method4027((byte)63);
         }

         int var11 = -((arg2 - -arg5 + -1) / arg5);
         int var12 = var10;
         int var10000;
         if (var7) {
            var10000 = var11;
         } else if (~var10 <= -1) {
            var10000 = 0;
            if (!var7) {
               return false;
            }
         } else {
            var10000 = var11;
         }

         while(true) {
            int var13 = var10000;
            if (var7) {
               if (arg1[arg3] == 0) {
                  return true;
               }

               arg3 += arg5;
               ++var13;
            }

            while(true) {
               while(var13 < 0) {
                  if (arg1[arg3] == 0) {
                     return true;
                  }

                  arg3 += arg5;
                  ++var13;
               }

               arg3 -= var9;
               var10000 = ~arg1[arg3 + -1];
               if (!var7) {
                  if (var10000 == -1) {
                     return true;
                  }

                  arg3 += arg0;
                  ++var12;
                  if (~var12 <= -1) {
                     var10000 = 0;
                     if (!var7) {
                        return false;
                     }
                  } else {
                     var10000 = var11;
                  }
                  break;
               }

               arg3 = var10000 + -1;
               ++var13;
            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field8062[5] + arg0 + ',' + (arg1 != null ? field8062[1] : field8062[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method1462(byte arg0) {
      try {
         ++field8056;
         if (arg0 >= -9) {
            return -13;
         } else {
            return this.field8059 == null ? 0 : this.field8059.field1856 * 100 / (this.field8059.field1889.length - this.field8058);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8062[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(Z)[B"
   )
   public final byte[] method1464(boolean arg0) {
      try {
         ++field8057;
         if (!arg0) {
            return null;
         } else if (!super.field2586 && this.field8059.field1856 >= this.field8059.field1889.length + -this.field8058) {
            return this.field8059.field1889;
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8062[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4030(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4031(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
