import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class487 extends class153 {
   @OriginalMember(
      owner = "client!bg",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7083 = new String[]{method3683(method3682("\u0014dhN\u001a")), method3683(method3682("\r-h\"O")), method3683(method3682("\u0001?*\f")), method3683(method3682("\r-h%O")), method3683(method3682("\r-h#O")), method3683(method3682("\r-h$O")), method3683(method3682("\r-h&O")), method3683(method3682("\r-h!O"))};
   @OriginalMember(
      owner = "client!bg",
      name = "x",
      descriptor = "I"
   )
   public static int field7080 = 0;
   @OriginalMember(
      owner = "client!bg",
      name = "y",
      descriptor = "Liw;"
   )
   public static class332 field7076 = new class332();
   @OriginalMember(
      owner = "client!bg",
      name = "v",
      descriptor = "I"
   )
   public static int field7075;
   @OriginalMember(
      owner = "client!bg",
      name = "u",
      descriptor = "I"
   )
   public static int field7077;
   @OriginalMember(
      owner = "client!bg",
      name = "w",
      descriptor = "I"
   )
   public static int field7078;
   @OriginalMember(
      owner = "client!bg",
      name = "t",
      descriptor = "I"
   )
   public static int field7081;
   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "I"
   )
   public static int field7082;
   @OriginalMember(
      owner = "client!bg",
      name = "s",
      descriptor = "[[I"
   )
   public static int[][] field7079;

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1419(byte arg0) {
      try {
         ++field7077;
         if (arg0 < 65) {
            field7080 = -44;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7083[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class487(OggStreamState arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(IIZIII[B)Z"
   )
   public static final boolean method3678(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, byte[] arg6) {
      boolean var7 = client.field4564;

      try {
         int var9;
         label84: {
            ++field7078;
            int var8 = arg1 % arg3;
            if (~var8 != -1) {
               var9 = -var8 + arg3;
               if (!var7) {
                  break label84;
               }
            }

            var9 = 0;
         }

         int var10 = -((arg5 - -arg3 + -1) / arg3);
         int var11 = -((arg1 - 1 + arg3) / arg3);
         if (!arg2) {
            field7079 = null;
         }

         int var12 = var10;
         int var10000;
         if (var7) {
            var10000 = var11;
         } else if (var10 >= 0) {
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
               if (arg6[arg4] == 0) {
                  return true;
               }

               arg4 += arg3;
               ++var13;
            }

            while(true) {
               byte var16;
               if (~var13 <= -1) {
                  arg4 -= var9;
                  var16 = arg6[arg4 + -1];
                  if (!var7) {
                     if (var16 == 0) {
                        return true;
                     }

                     arg4 += arg0;
                     ++var12;
                     if (var12 >= 0) {
                        var10000 = 0;
                        if (!var7) {
                           return false;
                        }
                     } else {
                        var10000 = var11;
                     }
                     break;
                  }
               } else {
                  var16 = arg6[arg4];
               }

               if (var16 == 0) {
                  return true;
               }

               arg4 += arg3;
               ++var13;
            }
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field7083[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7083[0] : field7083[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public final void method1418(OggPacket arg0, int arg1) {
      try {
         if (arg1 < 92) {
            this.method1418((OggPacket)null, -90);
         }

         ++field7081;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7083[1] + (arg0 != null ? field7083[0] : field7083[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method3679(int arg0, int arg1) {
      try {
         ++field7075;
         if (arg0 != -28876) {
            method3681((byte)65);
         }

         return arg1 >>> 8;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7083[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method3680(byte arg0) {
      try {
         field7076 = null;
         field7079 = null;
         if (arg0 != 111) {
            method3678(20, -89, false, 23, -80, 70, (byte[])null);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7083[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method3681(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3682(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3683(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
