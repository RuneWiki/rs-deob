import java.awt.Canvas;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class748 extends class606 {
   @OriginalMember(
      owner = "client!fq",
      name = "H",
      descriptor = "[B"
   )
   private byte[] field10627 = new byte[512];
   @OriginalMember(
      owner = "client!fq",
      name = "E",
      descriptor = "I"
   )
   private int field10628 = 0;
   @OriginalMember(
      owner = "client!fq",
      name = "P",
      descriptor = "I"
   )
   private int field10631 = 1;
   @OriginalMember(
      owner = "client!fq",
      name = "Q",
      descriptor = "I"
   )
   private int field10635 = 2048;
   @OriginalMember(
      owner = "client!fq",
      name = "F",
      descriptor = "I"
   )
   private int field10637 = 5;
   @OriginalMember(
      owner = "client!fq",
      name = "S",
      descriptor = "[S"
   )
   private short[] field10638 = new short[512];
   @OriginalMember(
      owner = "client!fq",
      name = "L",
      descriptor = "I"
   )
   private int field10633 = 5;
   @OriginalMember(
      owner = "client!fq",
      name = "U",
      descriptor = "I"
   )
   private int field10636 = 2;
   @OriginalMember(
      owner = "client!fq",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10642 = new String[]{method5387(method5386("\n\u0010)>P")), method5387(method5386("\n\u0010)<P")), method5387(method5386("\n\u0010)?P")), method5387(method5386("\u0002\u0014k\u001b")), method5387(method5386("\u0017O)Y\u0005")), method5387(method5386("\n\u0010)6P")), method5387(method5386("\u000f\u0016")), method5387(method5386("\n\u0010)2P")), method5387(method5386("\n\u0010)0P"))};
   @OriginalMember(
      owner = "client!fq",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field10640 = new int[50];
   @OriginalMember(
      owner = "client!fq",
      name = "M",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field10639 = new Hashtable();
   @OriginalMember(
      owner = "client!fq",
      name = "N",
      descriptor = "I"
   )
   public static int field10641 = 0;
   @OriginalMember(
      owner = "client!fq",
      name = "G",
      descriptor = "I"
   )
   public static int field10626;
   @OriginalMember(
      owner = "client!fq",
      name = "O",
      descriptor = "I"
   )
   public static int field10629;
   @OriginalMember(
      owner = "client!fq",
      name = "R",
      descriptor = "I"
   )
   public static int field10630;
   @OriginalMember(
      owner = "client!fq",
      name = "T",
      descriptor = "I"
   )
   public static int field10632;
   @OriginalMember(
      owner = "client!fq",
      name = "J",
      descriptor = "I"
   )
   public static int field10634;

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label82: {
            label81: {
               label80: {
                  label79: {
                     label78: {
                        label77: {
                           label76: {
                              if (~arg1 != -1) {
                                 if (arg1 == 1) {
                                    break label76;
                                 }

                                 if (~arg1 == -3) {
                                    break label77;
                                 }

                                 if (~arg1 == -4) {
                                    break label78;
                                 }

                                 if (arg1 == 4) {
                                    break label79;
                                 }

                                 if (arg1 == 5) {
                                    break label80;
                                 }

                                 if (~arg1 != -7) {
                                    break label82;
                                 }

                                 if (!var4) {
                                    break label81;
                                 }
                              }

                              this.field10633 = this.field10637 = arg0.method665(false);
                              if (!var4) {
                                 break label82;
                              }
                           }

                           this.field10628 = arg0.method665(false);
                           if (!var4) {
                              break label82;
                           }
                        }

                        this.field10635 = arg0.method685(-2);
                        if (!var4) {
                           break label82;
                        }
                     }

                     this.field10636 = arg0.method665(false);
                     if (!var4) {
                        break label82;
                     }
                  }

                  this.field10631 = arg0.method665(false);
                  if (!var4) {
                     break label82;
                  }
               }

               this.field10633 = arg0.method665(false);
               if (!var4) {
                  break label82;
               }
            }

            this.field10637 = arg0.method665(false);
         }

         if (arg2 > -6) {
            field10640 = null;
         }

         ++field10634;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10642[5] + (arg0 != null ? field10642[4] : field10642[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method270(byte arg0) {
      try {
         ++field10626;
         if (arg0 >= 118) {
            this.field10627 = class597.method4376(28805, this.field10628);
            this.method5384(-1);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10642[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fq",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method5382(byte arg0) {
      try {
         field10640 = null;
         int var1 = -41 % ((arg0 - 6) / 32);
         field10639 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10642[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(IIBLjava/awt/Canvas;)Leja;"
   )
   public static final class633 method5383(int arg0, int arg1, byte arg2, Canvas arg3) {
      try {
         ++field10632;
         if (arg2 != 119) {
            field10640 = null;
         }

         try {
            Class var4 = Class.forName(field10642[6]);
            class633 var5 = (class633)var4.newInstance();
            var5.method1196(arg1, arg3, arg2 ^ 123, arg0);
            return var5;
         } catch (Throwable var8) {
            class121 var6 = new class121();
            var6.method1196(arg1, arg3, 12, arg0);
            return var6;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field10642[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10642[4] : field10642[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "f",
      descriptor = "(I)V"
   )
   private final void method5384(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(Lwb;Z)V"
   )
   public static final void method5385(class578 arg0, boolean arg1) {
      for(int var2 = arg0.field8154; var2 <= arg0.field8150; ++var2) {
         for(int var3 = arg0.field8160; var3 <= arg0.field8155; ++var3) {
            class312 var4 = class324.field4826[arg0.field6824][var2][var3];
            if (var4 != null) {
               class84 var5 = var4.field4678;
               class84 var6 = null;

               while(var5 != null) {
                  if (var5.field1299 == arg0) {
                     if (var6 != null) {
                        var6.field1305 = var5.field1305;
                     } else {
                        var4.field4678 = var5.field1305;
                     }

                     var5.method890(26325);
                     break;
                  }

                  var6 = var5;
                  var5 = var5.field1305;
               }
            }
         }
      }

      if (!arg1) {
         class631.method4625(arg0);
      }

   }

   @OriginalMember(
      owner = "client!fq",
      name = "<init>",
      descriptor = "()V"
   )
   public class748() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!fq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5386(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5387(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
