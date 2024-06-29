import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class516 extends class3 {
   @OriginalMember(
      owner = "client!ef",
      name = "l",
      descriptor = "I"
   )
   public int field7449;
   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7452 = new String[]{method3761(method3760("\nx]wX")), method3761(method3760("\u00140]\u0018\r")), method3761(method3760("\u001f#\u001f5")), method3761(method3760("\u00140]eL\u001f?\u0007g\r")), method3761(method3760("M?\u001e>\u0018@h")), method3761(method3760("\u00140]\u001b\r")), method3761(method3760("Q?\u0003c")), method3761(method3760("\u00188\u00056\u001f")), method3761(method3760("\u001e&\u00167V\u001f")), method3761(method3760("Q{S")), method3761(method3760("%gSt\u0005")), method3761(method3760("M?\u001e>\u0018Ah")), method3761(method3760("\u00140]\u001c\r")), method3761(method3760("\u00140]\u001a\r"))};
   @OriginalMember(
      owner = "client!ef",
      name = "m",
      descriptor = "I"
   )
   public static int field7447;
   @OriginalMember(
      owner = "client!ef",
      name = "n",
      descriptor = "I"
   )
   public static int field7448;
   @OriginalMember(
      owner = "client!ef",
      name = "k",
      descriptor = "I"
   )
   public static int field7450;
   @OriginalMember(
      owner = "client!ef",
      name = "j",
      descriptor = "I"
   )
   public static int field7451;

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(IIIIILha;I)Lka;"
   )
   public static final class500 method3755(int arg0, int arg1, int arg2, int arg3, int arg4, class66 arg5, int arg6) {
      try {
         ++field7451;
         long var7 = (long)arg6;
         class500 var9 = (class500)class541.field7769.method725(0, var7);
         if (arg0 != 11376) {
            method3756((String)null, (String)null, 56, (String)null, -122, (String)null, 1, (String)null, (byte)14);
         }

         short var10 = 2055;
         if (var9 == null) {
            class464 var11 = class695.method5060(arg6, 0, (byte)-106, class699.field10238);
            if (var11 == null) {
               return null;
            }

            if (var11.field6680 < 13) {
               var11.method3381((byte)70, 2);
            }

            var9 = arg5.method555(var11, var10, class245.field3383, 64, 768);
            class541.field7769.method723(0, var7, var9);
         }

         class500 var12 = var9.method159((byte)2, var10, true);
         if (arg4 != 0) {
            var12.method156(arg4);
         }

         if (arg2 != 0) {
            var12.method227(arg2);
         }

         if (arg3 != 0) {
            var12.method193(arg3);
         }

         if (~arg1 != -1) {
            var12.method164(0, arg1, 0);
         }

         return var12;
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field7452[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7452[0] : field7452[2]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;B)V"
   )
   public static final void method3756(String arg0, String arg1, int arg2, String arg3, int arg4, String arg5, int arg6, String arg7, byte arg8) {
      boolean var9 = client.field4360;

      try {
         ++field7448;
         class157 var10 = class377.field5448[99];
         int var11 = 99;
         if (var9) {
            class377.field5448[var11] = class377.field5448[var11 + -1];
            --var11;
         }

         while(true) {
            while(~var11 < -1) {
               class377.field5448[var11] = class377.field5448[var11 + -1];
               --var11;
            }

            if (!var9) {
               label54: {
                  if (var10 != null) {
                     var10.method1315(arg1, arg6, -89, arg3, arg7, arg2, arg0, arg4, arg5);
                     if (!var9) {
                        break label54;
                     }
                  }

                  var10 = new class157(arg6, arg4, arg5, arg3, arg0, arg7, arg2, arg1);
               }

               if (arg8 >= -97) {
                  return;
               }

               class377.field5448[0] = var10;
               class113.field1419 = class768.field11318;
               ++class76.field955;
               return;
            }

            --var11;
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field7452[13] + (arg0 != null ? field7452[0] : field7452[2]) + ',' + (arg1 != null ? field7452[0] : field7452[2]) + ',' + arg2 + ',' + (arg3 != null ? field7452[0] : field7452[2]) + ',' + arg4 + ',' + (arg5 != null ? field7452[0] : field7452[2]) + ',' + arg6 + ',' + (arg7 != null ? field7452[0] : field7452[2]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class516(int arg0) {
      try {
         this.field7449 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7452[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(BLha;IIIII)V"
   )
   public static final void method3757(byte param0, class66 param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(ZLhba;)Z"
   )
   public static final boolean method3758(boolean param0, class10 param1) throws IOException {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(Lgn;[Lmn;)V"
   )
   public static final void method3759(class731 arg0, class389[] arg1) {
      if (class316.field4302) {
         int var2 = arg0.method1763(arg1, true);
         class80.field1038.method553(var2, arg1);
      }

      if (class757.field11220 == class731.field10698) {
         boolean var3 = false;
         boolean var4 = false;
         int var5;
         int var6;
         if (arg0 instanceof class627) {
            var5 = ((class627)arg0).field9207;
            var6 = ((class627)arg0).field9208;
         } else {
            var5 = arg0.field10694 >> class773.field11359;
            var6 = arg0.field10693 >> class773.field11359;
         }

         class80.field1038.method557(class265.field3658[0].method2220(arg0.field10693, arg0.field10694, -30), class299.method2232(var5, var6), class26.method256(var5, var6), class583.method4255(var5, var6));
      }

      class623 var7 = arg0.method242(111, class80.field1038);
      if (var7 != null) {
         if (arg0.field10706) {
            class307[] var8 = var7.field9164;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               class307 var10 = var8[var9];
               if (var10.field4191) {
                  class193.method1520(var10.field4193 - var10.field4195, -117, var10.field4195 + var10.field4192, var10.field4196 + var10.field4195, var10.field4194 - var10.field4195);
               }
            }
         }

         if (var7.field9165) {
            var7.field9168 = arg0;
            if (class767.field11310) {
               class263 var11 = class146.field1851;
               synchronized(class146.field1851) {
                  class146.field1851.method2009(-92, var7);
                  return;
               }
            }

            class146.field1851.method2009(-80, var7);
            return;
         }

         class198.method1565(false, var7);
      }

   }

   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3760(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3761(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
