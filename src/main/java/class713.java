import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public abstract class class713 extends class82 {
   @OriginalMember(
      owner = "client!nl",
      name = "s",
      descriptor = "Z"
   )
   public boolean field10463 = false;
   @OriginalMember(
      owner = "client!nl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10471 = new String[]{method5208(method5207("\u0019\u00177P7_")), method5208(method5207("\fU77\b")), method5208(method5207("\u0019\u000euu")), method5208(method5207("\u0019\u00177R7_"))};
   @OriginalMember(
      owner = "client!nl",
      name = "t",
      descriptor = "B"
   )
   public byte field10457;
   @OriginalMember(
      owner = "client!nl",
      name = "h",
      descriptor = "B"
   )
   public byte field10459;
   @OriginalMember(
      owner = "client!nl",
      name = "k",
      descriptor = "I"
   )
   public int field10460;
   @OriginalMember(
      owner = "client!nl",
      name = "q",
      descriptor = "I"
   )
   public static int field10461;
   @OriginalMember(
      owner = "client!nl",
      name = "l",
      descriptor = "I"
   )
   public static int field10462;
   @OriginalMember(
      owner = "client!nl",
      name = "j",
      descriptor = "I"
   )
   public int field10464;
   @OriginalMember(
      owner = "client!nl",
      name = "m",
      descriptor = "I"
   )
   public int field10465;
   @OriginalMember(
      owner = "client!nl",
      name = "o",
      descriptor = "I"
   )
   public int field10466;
   @OriginalMember(
      owner = "client!nl",
      name = "n",
      descriptor = "I"
   )
   public int field10467;
   @OriginalMember(
      owner = "client!nl",
      name = "g",
      descriptor = "I"
   )
   public int field10468;
   @OriginalMember(
      owner = "client!nl",
      name = "r",
      descriptor = "I"
   )
   public static int field10470;
   @OriginalMember(
      owner = "client!nl",
      name = "i",
      descriptor = "Lnl;"
   )
   public class713 field10469;
   @OriginalMember(
      owner = "client!nl",
      name = "p",
      descriptor = "Z"
   )
   public boolean field10458;

   @OriginalMember(
      owner = "client!nl",
      name = "d",
      descriptor = "(B)I"
   )
   public abstract int method76(byte arg0);

   @OriginalMember(
      owner = "client!nl",
      name = "d",
      descriptor = "(Z)Z"
   )
   public abstract boolean method244(boolean arg0);

   @OriginalMember(
      owner = "client!nl",
      name = "b",
      descriptor = "(BLha;)Lwo;"
   )
   public abstract class328 method176(byte arg0, class479 arg1);

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(Lha;IZI)Z"
   )
   public abstract boolean method185(class479 arg0, int arg1, boolean arg2, int arg3);

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(Lha;ZZLnl;III)V"
   )
   public abstract void method183(class479 arg0, boolean arg1, boolean arg2, class713 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!nl",
      name = "c",
      descriptor = "(Z)I"
   )
   public abstract int method74(boolean arg0);

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(ZLha;)V"
   )
   public abstract void method174(boolean arg0, class479 arg1);

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(II[Lue;B)I"
   )
   public final int method5206(int arg0, int arg1, class243[] arg2, byte arg3) {
      boolean var5 = client.field1481;

      try {
         ++field10462;
         long var6 = class314.field4356[this.field10457][arg0][arg1];
         if (arg3 != 56) {
            return -17;
         } else {
            int var10;
            int var11;
            label56: {
               long var8 = 0L;
               var10 = 0;
               if (var5) {
                  var11 = (int)(var6 >> (int)var8 & 65535L);
               } else if (~var8 < -49L) {
                  var11 = var10;
                  if (!var5) {
                     break label56;
                  }
               } else {
                  var11 = (int)(var6 >> (int)var8 & 65535L);
               }

               label55:
               while(true) {
                  while(~var11 >= -1) {
                     var11 = var10;
                     if (!var5) {
                        break label55;
                     }
                  }

                  arg2[var10++] = class375.field5241[var11 - 1].field9839;
                  var8 += 16L;
                  if (~var8 < -49L) {
                     var11 = var10;
                     if (!var5) {
                        break;
                     }
                  } else {
                     var11 = (int)(var6 >> (int)var8 & 65535L);
                  }
               }
            }

            if (var5) {
               arg2[var11] = null;
               ++var11;
            }

            while(true) {
               while(~var11 > -5) {
                  arg2[var11] = null;
                  ++var11;
               }

               if (!var5) {
                  return var10;
               }

               ++var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field10471[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10471[1] : field10471[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "c",
      descriptor = "(I)I"
   )
   public int method789(int arg0) {
      try {
         int var2 = 11 / ((-3 - arg0) / 52);
         ++field10461;
         return 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10471[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(I[Lue;)I"
   )
   public abstract int method240(int arg0, class243[] arg1);

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(BLha;)Lnk;"
   )
   public abstract class484 method186(byte arg0, class479 arg1);

   @OriginalMember(
      owner = "client!nl",
      name = "b",
      descriptor = "(ILha;)Z"
   )
   public abstract boolean method242(int arg0, class479 arg1);

   @OriginalMember(
      owner = "client!nl",
      name = "d",
      descriptor = "(I)Z"
   )
   public abstract boolean method67(int arg0);

   @OriginalMember(
      owner = "client!nl",
      name = "e",
      descriptor = "(I)Z"
   )
   public abstract boolean method178(int arg0);

   @OriginalMember(
      owner = "client!nl",
      name = "e",
      descriptor = "(B)Z"
   )
   public abstract boolean method69(byte arg0);

   @OriginalMember(
      owner = "client!nl",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method190(int arg0);

   @OriginalMember(
      owner = "client!nl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5207(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5208(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
