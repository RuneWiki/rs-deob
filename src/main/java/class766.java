import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class766 {
   @OriginalMember(
      owner = "client!iba",
      name = "l",
      descriptor = "Z"
   )
   public boolean field10989 = false;
   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "I"
   )
   public int field10991 = 64;
   @OriginalMember(
      owner = "client!iba",
      name = "k",
      descriptor = "I"
   )
   public int field10994 = -1;
   @OriginalMember(
      owner = "client!iba",
      name = "h",
      descriptor = "I"
   )
   public int field10990 = 64;
   @OriginalMember(
      owner = "client!iba",
      name = "g",
      descriptor = "Z"
   )
   public boolean field10993 = false;
   @OriginalMember(
      owner = "client!iba",
      name = "e",
      descriptor = "I"
   )
   public int field10997 = 1;
   @OriginalMember(
      owner = "client!iba",
      name = "m",
      descriptor = "I"
   )
   public int field10992 = 2;
   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11000 = new String[]{method5520(method5519("\u0018)\u001aCSY")), method5520(method5519("\u001f>\u0017\u0001")), method5520(method5519("\neUCm")), method5520(method5519("\u0018)\u001aCQY")), method5520(method5519("\u0018)\u001aCRY"))};
   @OriginalMember(
      owner = "client!iba",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field10988 = new int[1];
   @OriginalMember(
      owner = "client!iba",
      name = "j",
      descriptor = "I"
   )
   public static int field10995 = 0;
   @OriginalMember(
      owner = "client!iba",
      name = "f",
      descriptor = "I"
   )
   public static int field10999 = 0;
   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "I"
   )
   public static int field10996;
   @OriginalMember(
      owner = "client!iba",
      name = "i",
      descriptor = "I"
   )
   public static int field10998;
   @OriginalMember(
      owner = "client!iba",
      name = "c",
      descriptor = "Lma;"
   )
   public static class148 field10987;
   @OriginalMember(
      owner = "client!iba",
      name = "n",
      descriptor = "Lfs;"
   )
   public static class796 field10986;

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5516(int arg0) {
      try {
         field10986 = null;
         field10987 = null;
         if (arg0 > -98) {
            field10999 = 9;
         }

         field10988 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11000[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(IILcu;)V"
   )
   public final void method5517(int arg0, int arg1, class65 arg2) {
      boolean var4 = client.field10022;

      try {
         if (arg1 != 1) {
            this.method5518((class65)null, 108, (byte)-17, 94);
         }

         ++field10996;

         do {
            int var5 = arg2.method665(false);
            if (~var5 == -1) {
               break;
            }

            this.method5518(arg2, arg0, (byte)-126, var5);
         } while(!var4);

      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field11000[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11000[2] : field11000[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(Lcu;IBI)V"
   )
   private final void method5518(class65 arg0, int arg1, byte arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         label70: {
            if (arg3 != 1) {
               if (~arg3 == -3) {
                  this.field10990 = 1 + arg0.method685(-2);
                  this.field10991 = 1 + arg0.method685(-2);
                  if (!var5) {
                     break label70;
                  }
               }

               if (arg3 != 3) {
                  if (~arg3 == -5) {
                     this.field10992 = arg0.method665(false);
                     if (!var5) {
                        break label70;
                     }
                  }

                  if (~arg3 == -6) {
                     this.field10997 = arg0.method665(false);
                     if (!var5) {
                        break label70;
                     }
                  }

                  if (arg3 == 6) {
                     this.field10989 = true;
                     if (!var5) {
                        break label70;
                     }
                  }

                  if (~arg3 != -8) {
                     break label70;
                  }

                  this.field10993 = true;
                  if (!var5) {
                     break label70;
                  }
               }

               arg0.method638(true);
               if (!var5) {
                  break label70;
               }
            }

            this.field10994 = arg0.method685(-2);
            if (this.field10994 == 65535) {
               this.field10994 = -1;
            }
         }

         ++field10998;
         if (arg2 > -121) {
            field10995 = -41;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field11000[4] + (arg0 != null ? field11000[2] : field11000[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5519(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5520(char[] arg0) {
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
            var10005 = 75;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
