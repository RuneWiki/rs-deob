import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oka")
public class class708 extends class171 {
   @OriginalMember(
      owner = "client!oka",
      name = "t",
      descriptor = "I"
   )
   private int field10408 = -1;
   @OriginalMember(
      owner = "client!oka",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10414 = new String[]{method5180(method5179("g\u0004&lt ")), method5180(method5179("g\u0004&lq ")), method5180(method5179("f\u001a+.")), method5180(method5179("sAilH")), method5180(method5179("g\u0004&lp ")), method5180(method5179("g\u0004&lv ")), method5180(method5179("g\u0004&lw ")), method5180(method5179("g\u0004&ls ")), method5180(method5179("|\b&"))};
   @OriginalMember(
      owner = "client!oka",
      name = "z",
      descriptor = "[Z"
   )
   public static boolean[] field10409 = new boolean[100];
   @OriginalMember(
      owner = "client!oka",
      name = "q",
      descriptor = "D"
   )
   public static double field10404;
   @OriginalMember(
      owner = "client!oka",
      name = "x",
      descriptor = "I"
   )
   public static int field10406;
   @OriginalMember(
      owner = "client!oka",
      name = "v",
      descriptor = "I"
   )
   public static int field10407;
   @OriginalMember(
      owner = "client!oka",
      name = "y",
      descriptor = "I"
   )
   public static int field10410;
   @OriginalMember(
      owner = "client!oka",
      name = "s",
      descriptor = "I"
   )
   public static int field10411;
   @OriginalMember(
      owner = "client!oka",
      name = "w",
      descriptor = "I"
   )
   public static int field10412;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!oka",
      name = "r",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10413;
   @OriginalMember(
      owner = "client!oka",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field10405;

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method5174(int arg0, int arg1, byte arg2) {
      try {
         int var3 = 39 % ((arg2 - -9) / 45);
         ++field10410;
         return ~(262144 & arg1) != -1 | class571.method4292(256, arg1, arg0) || class401.method3144(arg1, (byte)22, arg0);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10414[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5175(byte arg0) {
      try {
         field10409 = null;
         field10405 = null;
         if (arg0 != 60) {
            field10404 = 1.1314305666108913D;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10414[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public static final boolean method5176(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg1 != 255) {
            return false;
         } else {
            ++field10406;
            boolean var4 = true;
            class660 var5 = (class660)class776.method5607(arg0, arg3, arg2);
            if (var5 != null) {
               var4 &= class371.method2940(var5, 6798);
            }

            class660 var6 = (class660)class338.method2672(arg0, arg3, arg2, field10413 != null ? field10413 : (field10413 = method5178(field10414[8])));
            if (var6 != null) {
               var4 &= class371.method2940(var6, 6798);
            }

            class660 var7 = (class660)class688.method5028(arg0, arg3, arg2);
            if (var7 != null) {
               var4 &= class371.method2940(var7, 6798);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field10414[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method5177(int arg0) {
      try {
         if (arg0 != 13814) {
            field10404 = 0.23083832234232501D;
         }

         ++field10411;

         try {
            if (class533.field7825 == 1) {
               int var1 = class98.field1305.method5156(arg0 ^ 277930909);
               if (~var1 < -1 && class98.field1305.method5139((byte)22)) {
                  int var2 = var1 - class242.field3046;
                  if (var2 < 0) {
                     var2 = 0;
                  }

                  class98.field1305.method5157(var2, (byte)122);
                  return;
               }

               label48: {
                  class98.field1305.method5161(88);
                  class98.field1305.method5144(-128);
                  if (class471.field6491 != null) {
                     class533.field7825 = 2;
                     if (!client.field1481) {
                        break label48;
                     }
                  }

                  class533.field7825 = 0;
               }

               class131.field1677 = null;
               class424.field5777 = null;
            }

            if (~class533.field7825 == -4) {
               int var3 = class98.field1305.method5156(277927531);
               if (class624.field9229 > var3 && class98.field1305.method5139((byte)74)) {
                  int var4 = class704.field10292 + var3;
                  if (class624.field9229 < var4) {
                     var4 = class624.field9229;
                  }

                  class98.field1305.method5157(var4, (byte)-24);
               } else {
                  class704.field10292 = 0;
                  class533.field7825 = 0;
               }
            }
         } catch (Exception var7) {
            var7.printStackTrace();
            class98.field1305.method5161(96);
            class176.field2274 = null;
            class471.field6491 = null;
            class424.field5777 = null;
            class533.field7825 = 0;
            class131.field1677 = null;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10414[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(Lgea;B)V"
   )
   public final void method1104(class66 arg0, byte arg1) {
      try {
         ++field10412;
         this.field10408 = arg0.method603(-2);
         arg0.method640(255);
         if (arg1 != -111) {
            field10409 = null;
         }

         if (arg0.method640(255) != 255) {
            --arg0.field864;
            arg0.method660(116);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10414[1] + (arg0 != null ? field10414[3] : field10414[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(Lfu;I)V"
   )
   public final void method1106(class80 arg0, int arg1) {
      try {
         ++field10407;
         arg0.method773(arg1 ^ 3243, this.field10408);
         if (arg1 != -3244) {
            method5176(-114, 75, 100, -70);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10414[5] + (arg0 != null ? field10414[3] : field10414[2]) + ',' + arg1 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!oka",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5178(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!oka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5179(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5180(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
