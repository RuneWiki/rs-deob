package deob;

@ObfuscatedName("EOLCIJGV")
public class EOLCIJGV {

	@ObfuscatedName("EOLCIJGV.g")
	public int field561 = 0;

	@ObfuscatedName("EOLCIJGV.h")
	public int field562 = 0;

	@ObfuscatedName("EOLCIJGV.i")
	public int field563;

	@ObfuscatedName("EOLCIJGV.j")
	public int field564;

	@ObfuscatedName("EOLCIJGV.k")
	public int[][] field565;

	public EOLCIJGV(int arg0, int arg1) {
		field563 = arg0;
		field564 = arg1;
		field565 = new int[field563][field564];
		method285();
	}

	@ObfuscatedName("EOLCIJGV.a()V")
	public void method285() {
		for (int var1 = 0; var1 < field563; var1++) {
			for (int var2 = 0; var2 < field564; var2++) {
				if (var1 == 0 || var2 == 0 || field563 - 1 == var1 || field564 - 1 == var2) {
					field565[var1][var2] = 0xFFFFFF;
				} else {
					field565[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("EOLCIJGV.a(IIIIIZ)V")
	public void method286(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg3 -= field561;
		arg1 -= field562;
		if (arg2 == 0) {
			if (arg0 == 0) {
				method289(arg3, arg1, 128);
				method289(arg3 - 1, arg1, 8);
			}

			if (arg0 == 1) {
				method289(arg3, arg1, 2);
				method289(arg3, arg1 + 1, 32);
			}

			if (arg0 == 2) {
				method289(arg3, arg1, 8);
				method289(arg3 + 1, arg1, 128);
			}

			if (arg0 == 3) {
				method289(arg3, arg1, 32);
				method289(arg3, arg1 - 1, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				method289(arg3, arg1, 1);
				method289(arg3 - 1, arg1 + 1, 16);
			}

			if (arg0 == 1) {
				method289(arg3, arg1, 4);
				method289(arg3 + 1, arg1 + 1, 64);
			}

			if (arg0 == 2) {
				method289(arg3, arg1, 16);
				method289(arg3 + 1, arg1 - 1, 1);
			}

			if (arg0 == 3) {
				method289(arg3, arg1, 64);
				method289(arg3 - 1, arg1 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg0 == 0) {
				method289(arg3, arg1, 130);
				method289(arg3 - 1, arg1, 8);
				method289(arg3, arg1 + 1, 32);
			}

			if (arg0 == 1) {
				method289(arg3, arg1, 10);
				method289(arg3, arg1 + 1, 32);
				method289(arg3 + 1, arg1, 128);
			}

			if (arg0 == 2) {
				method289(arg3, arg1, 40);
				method289(arg3 + 1, arg1, 128);
				method289(arg3, arg1 - 1, 2);
			}

			if (arg0 == 3) {
				method289(arg3, arg1, 160);
				method289(arg3, arg1 - 1, 2);
				method289(arg3 - 1, arg1, 8);
			}
		}

		if (arg4) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					method289(arg3, arg1, 0x10000);
					method289(arg3 - 1, arg1, 4096);
				}

				if (arg0 == 1) {
					method289(arg3, arg1, 1024);
					method289(arg3, arg1 + 1, 16384);
				}

				if (arg0 == 2) {
					method289(arg3, arg1, 4096);
					method289(arg3 + 1, arg1, 0x10000);
				}

				if (arg0 == 3) {
					method289(arg3, arg1, 16384);
					method289(arg3, arg1 - 1, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					method289(arg3, arg1, 512);
					method289(arg3 - 1, arg1 + 1, 8192);
				}

				if (arg0 == 1) {
					method289(arg3, arg1, 2048);
					method289(arg3 + 1, arg1 + 1, 32768);
				}

				if (arg0 == 2) {
					method289(arg3, arg1, 8192);
					method289(arg3 + 1, arg1 - 1, 512);
				}

				if (arg0 == 3) {
					method289(arg3, arg1, 32768);
					method289(arg3 - 1, arg1 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg0 == 0) {
					method289(arg3, arg1, 66560);
					method289(arg3 - 1, arg1, 4096);
					method289(arg3, arg1 + 1, 16384);
				}

				if (arg0 == 1) {
					method289(arg3, arg1, 5120);
					method289(arg3, arg1 + 1, 16384);
					method289(arg3 + 1, arg1, 0x10000);
				}

				if (arg0 == 2) {
					method289(arg3, arg1, 20480);
					method289(arg3 + 1, arg1, 0x10000);
					method289(arg3, arg1 - 1, 1024);
				}

				if (arg0 == 3) {
					method289(arg3, arg1, 81920);
					method289(arg3, arg1 - 1, 1024);
					method289(arg3 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("EOLCIJGV.a(IZZIIII)V")
	public void method287(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg5 -= field561;
		arg0 -= field562;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg2;
			arg2 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg5; var9 < arg2 + arg5; var9++) {
			if (var9 >= 0 && var9 < field563) {
				for (int var10 = arg0; var10 < arg0 + arg3; var10++) {
					if (var10 >= 0 && var10 < field564) {
						method289(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("EOLCIJGV.a(IZI)V")
	public void method288(int arg0, int arg1) {
		arg1 -= field561;
		arg0 -= field562;
		field565[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("EOLCIJGV.a(III)V")
	public void method289(int arg0, int arg1, int arg2) {
		field565[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("EOLCIJGV.a(IIZIIZ)V")
	public void method290(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg3 -= field561;
		arg1 -= field562;
		if (arg4 == 0) {
			if (arg0 == 0) {
				method292(128, arg1, arg3);
				method292(8, arg1, arg3 - 1);
			}

			if (arg0 == 1) {
				method292(2, arg1, arg3);
				method292(32, arg1 + 1, arg3);
			}

			if (arg0 == 2) {
				method292(8, arg1, arg3);
				method292(128, arg1, arg3 + 1);
			}

			if (arg0 == 3) {
				method292(32, arg1, arg3);
				method292(2, arg1 - 1, arg3);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				method292(1, arg1, arg3);
				method292(16, arg1 + 1, arg3 - 1);
			}

			if (arg0 == 1) {
				method292(4, arg1, arg3);
				method292(64, arg1 + 1, arg3 + 1);
			}

			if (arg0 == 2) {
				method292(16, arg1, arg3);
				method292(1, arg1 - 1, arg3 + 1);
			}

			if (arg0 == 3) {
				method292(64, arg1, arg3);
				method292(4, arg1 - 1, arg3 - 1);
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				method292(130, arg1, arg3);
				method292(8, arg1, arg3 - 1);
				method292(32, arg1 + 1, arg3);
			}

			if (arg0 == 1) {
				method292(10, arg1, arg3);
				method292(32, arg1 + 1, arg3);
				method292(128, arg1, arg3 + 1);
			}

			if (arg0 == 2) {
				method292(40, arg1, arg3);
				method292(128, arg1, arg3 + 1);
				method292(2, arg1 - 1, arg3);
			}

			if (arg0 == 3) {
				method292(160, arg1, arg3);
				method292(2, arg1 - 1, arg3);
				method292(8, arg1, arg3 - 1);
			}
		}

		if (arg2) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					method292(0x10000, arg1, arg3);
					method292(4096, arg1, arg3 - 1);
				}

				if (arg0 == 1) {
					method292(1024, arg1, arg3);
					method292(16384, arg1 + 1, arg3);
				}

				if (arg0 == 2) {
					method292(4096, arg1, arg3);
					method292(0x10000, arg1, arg3 + 1);
				}

				if (arg0 == 3) {
					method292(16384, arg1, arg3);
					method292(1024, arg1 - 1, arg3);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					method292(512, arg1, arg3);
					method292(8192, arg1 + 1, arg3 - 1);
				}

				if (arg0 == 1) {
					method292(2048, arg1, arg3);
					method292(32768, arg1 + 1, arg3 + 1);
				}

				if (arg0 == 2) {
					method292(8192, arg1, arg3);
					method292(512, arg1 - 1, arg3 + 1);
				}

				if (arg0 == 3) {
					method292(32768, arg1, arg3);
					method292(2048, arg1 - 1, arg3 - 1);
				}
			}

			if (arg4 == 2) {
				if (arg0 == 0) {
					method292(66560, arg1, arg3);
					method292(4096, arg1, arg3 - 1);
					method292(16384, arg1 + 1, arg3);
				}

				if (arg0 == 1) {
					method292(5120, arg1, arg3);
					method292(16384, arg1 + 1, arg3);
					method292(0x10000, arg1, arg3 + 1);
				}

				if (arg0 == 2) {
					method292(20480, arg1, arg3);
					method292(0x10000, arg1, arg3 + 1);
					method292(1024, arg1 - 1, arg3);
				}

				if (arg0 == 3) {
					method292(81920, arg1, arg3);
					method292(1024, arg1 - 1, arg3);
					method292(4096, arg1, arg3 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("EOLCIJGV.a(IZIIIII)V")
	public void method291(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg0 -= field561;
		arg5 -= field562;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg4;
			arg4 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg4; var9++) {
			if (var9 >= 0 && var9 < field563) {
				for (int var10 = arg5; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field564) {
						method292(var7, var10, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("EOLCIJGV.a(IIII)V")
	public void method292(int arg0, int arg1, int arg2) {
		field565[arg2][arg1] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("EOLCIJGV.b(III)V")
	public void method293(int arg0, int arg1) {
		arg0 -= field561;
		arg1 -= field562;
		field565[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("EOLCIJGV.a(IIIIIIZ)Z")
	public boolean method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg5 && arg0 == arg1) {
			return true;
		}

		arg3 -= field561;
		arg1 -= field562;
		arg5 -= field561;
		arg0 -= field562;
		if (arg4 == 0) {
			if (arg2 == 0) {
				if (arg5 - 1 == arg3 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg1 && (field565[arg3][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg1 && (field565[arg3][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg3 == arg5 && arg0 + 1 == arg1) {
					return true;
				}

				if (arg5 - 1 == arg3 && arg0 == arg1 && (field565[arg3][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg3 && arg0 == arg1 && (field565[arg3][arg1] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg5 + 1 == arg3 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg1 && (field565[arg3][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg1 && (field565[arg3][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg3 == arg5 && arg0 - 1 == arg1) {
					return true;
				}

				if (arg5 - 1 == arg3 && arg0 == arg1 && (field565[arg3][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg3 && arg0 == arg1 && (field565[arg3][arg1] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg2 == 0) {
				if (arg5 - 1 == arg3 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg1) {
					return true;
				}

				if (arg5 + 1 == arg3 && arg0 == arg1 && (field565[arg3][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg1 && (field565[arg3][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg5 - 1 == arg3 && arg0 == arg1 && (field565[arg3][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg1) {
					return true;
				}

				if (arg5 + 1 == arg3 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg1 && (field565[arg3][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg5 - 1 == arg3 && arg0 == arg1 && (field565[arg3][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg1 && (field565[arg3][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg3 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg1) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg5 - 1 == arg3 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg1 && (field565[arg3][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg3 && arg0 == arg1 && (field565[arg3][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg1) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg3 == arg5 && arg0 + 1 == arg1 && (field565[arg3][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg5 && arg0 - 1 == arg1 && (field565[arg3][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg3 && arg0 == arg1 && (field565[arg3][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg3 && arg0 == arg1 && (field565[arg3][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EOLCIJGV.a(IIIIIII)Z")
	public boolean method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg4 && arg1 == arg3) {
			return true;
		}

		arg4 -= field561;
		arg1 -= field562;
		arg2 -= field561;
		arg3 -= field562;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}

			if (arg5 == 0) {
				if (arg2 + 1 == arg4 && arg1 == arg3 && (field565[arg4][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg3 - 1 == arg1 && (field565[arg4][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg2 - 1 == arg4 && arg1 == arg3 && (field565[arg4][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg3 - 1 == arg1 && (field565[arg4][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg2 - 1 == arg4 && arg1 == arg3 && (field565[arg4][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg3 + 1 == arg1 && (field565[arg4][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg2 + 1 == arg4 && arg1 == arg3 && (field565[arg4][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg3 + 1 == arg1 && (field565[arg4][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 8) {
			if (arg2 == arg4 && arg3 + 1 == arg1 && (field565[arg4][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg4 && arg3 - 1 == arg1 && (field565[arg4][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg4 && arg1 == arg3 && (field565[arg4][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg4 && arg1 == arg3 && (field565[arg4][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EOLCIJGV.a(IIIIIIII)Z")
	public boolean method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg3 - 1;
		int var9 = arg4 + arg6 - 1;
		if (arg5 >= arg3 && arg5 <= var8 && arg2 >= arg6 && arg2 <= var9) {
			return true;
		}

		if (arg3 - 1 == arg5 && arg2 >= arg6 && arg2 <= var9 && (field565[arg5 - field561][arg2 - field562] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg2 >= arg6 && arg2 <= var9 && (field565[arg5 - field561][arg2 - field562] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg6 - 1 == arg2 && arg5 >= arg3 && arg5 <= var8 && (field565[arg5 - field561][arg2 - field562] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg2 && arg5 >= arg3 && arg5 <= var8 && (field565[arg5 - field561][arg2 - field562] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
