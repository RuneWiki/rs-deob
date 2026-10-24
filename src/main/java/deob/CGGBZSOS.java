package deob;

@ObfuscatedName("CGGBZSOS")
public class CGGBZSOS {

	@ObfuscatedName("CGGBZSOS.i")
	public int field82 = 0;

	@ObfuscatedName("CGGBZSOS.j")
	public int field83 = 0;

	@ObfuscatedName("CGGBZSOS.k")
	public int field84;

	@ObfuscatedName("CGGBZSOS.l")
	public int field85;

	@ObfuscatedName("CGGBZSOS.m")
	public int[][] field86;

	public CGGBZSOS(int arg0, int arg1) {
		field84 = arg1;
		field85 = arg0;
		field86 = new int[field84][field85];
		method25();
	}

	@ObfuscatedName("CGGBZSOS.a()V")
	public void method25() {
		for (int var1 = 0; var1 < field84; var1++) {
			for (int var2 = 0; var2 < field85; var2++) {
				if (var1 == 0 || var2 == 0 || field84 - 1 == var1 || field85 - 1 == var2) {
					field86[var1][var2] = 0xFFFFFF;
				} else {
					field86[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("CGGBZSOS.a(BIIZII)V")
	public void method26(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg3 -= field82;
		arg0 -= field83;
		if (arg1 == 0) {
			if (arg4 == 0) {
				method29(arg3, arg0, 128);
				method29(arg3 - 1, arg0, 8);
			}

			if (arg4 == 1) {
				method29(arg3, arg0, 2);
				method29(arg3, arg0 + 1, 32);
			}

			if (arg4 == 2) {
				method29(arg3, arg0, 8);
				method29(arg3 + 1, arg0, 128);
			}

			if (arg4 == 3) {
				method29(arg3, arg0, 32);
				method29(arg3, arg0 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				method29(arg3, arg0, 1);
				method29(arg3 - 1, arg0 + 1, 16);
			}

			if (arg4 == 1) {
				method29(arg3, arg0, 4);
				method29(arg3 + 1, arg0 + 1, 64);
			}

			if (arg4 == 2) {
				method29(arg3, arg0, 16);
				method29(arg3 + 1, arg0 - 1, 1);
			}

			if (arg4 == 3) {
				method29(arg3, arg0, 64);
				method29(arg3 - 1, arg0 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg4 == 0) {
				method29(arg3, arg0, 130);
				method29(arg3 - 1, arg0, 8);
				method29(arg3, arg0 + 1, 32);
			}

			if (arg4 == 1) {
				method29(arg3, arg0, 10);
				method29(arg3, arg0 + 1, 32);
				method29(arg3 + 1, arg0, 128);
			}

			if (arg4 == 2) {
				method29(arg3, arg0, 40);
				method29(arg3 + 1, arg0, 128);
				method29(arg3, arg0 - 1, 2);
			}

			if (arg4 == 3) {
				method29(arg3, arg0, 160);
				method29(arg3, arg0 - 1, 2);
				method29(arg3 - 1, arg0, 8);
			}
		}

		if (arg2) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					method29(arg3, arg0, 0x10000);
					method29(arg3 - 1, arg0, 4096);
				}

				if (arg4 == 1) {
					method29(arg3, arg0, 1024);
					method29(arg3, arg0 + 1, 16384);
				}

				if (arg4 == 2) {
					method29(arg3, arg0, 4096);
					method29(arg3 + 1, arg0, 0x10000);
				}

				if (arg4 == 3) {
					method29(arg3, arg0, 16384);
					method29(arg3, arg0 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					method29(arg3, arg0, 512);
					method29(arg3 - 1, arg0 + 1, 8192);
				}

				if (arg4 == 1) {
					method29(arg3, arg0, 2048);
					method29(arg3 + 1, arg0 + 1, 32768);
				}

				if (arg4 == 2) {
					method29(arg3, arg0, 8192);
					method29(arg3 + 1, arg0 - 1, 512);
				}

				if (arg4 == 3) {
					method29(arg3, arg0, 32768);
					method29(arg3 - 1, arg0 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg4 == 0) {
					method29(arg3, arg0, 66560);
					method29(arg3 - 1, arg0, 4096);
					method29(arg3, arg0 + 1, 16384);
				}

				if (arg4 == 1) {
					method29(arg3, arg0, 5120);
					method29(arg3, arg0 + 1, 16384);
					method29(arg3 + 1, arg0, 0x10000);
				}

				if (arg4 == 2) {
					method29(arg3, arg0, 20480);
					method29(arg3 + 1, arg0, 0x10000);
					method29(arg3, arg0 - 1, 1024);
				}

				if (arg4 == 3) {
					method29(arg3, arg0, 81920);
					method29(arg3, arg0 - 1, 1024);
					method29(arg3 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("CGGBZSOS.a(IIIZZII)V")
	public void method27(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg5 -= field82;
		arg0 -= field83;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg4;
			arg4 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg5; var9 < arg4 + arg5; var9++) {
			if (var9 >= 0 && var9 < field84) {
				for (int var10 = arg0; var10 < arg0 + arg2; var10++) {
					if (var10 >= 0 && var10 < field85) {
						method29(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("CGGBZSOS.a(III)V")
	public void method28(int arg0, int arg1) {
		arg0 -= field82;
		arg1 -= field83;
		field86[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("CGGBZSOS.b(III)V")
	public void method29(int arg0, int arg1, int arg2) {
		field86[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("CGGBZSOS.a(IZZIII)V")
	public void method30(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg4 -= field82;
		arg0 -= field83;
		if (arg2 == 0) {
			if (arg3 == 0) {
				method32(arg4, 128, arg0);
				method32(arg4 - 1, 8, arg0);
			}

			if (arg3 == 1) {
				method32(arg4, 2, arg0);
				method32(arg4, 32, arg0 + 1);
			}

			if (arg3 == 2) {
				method32(arg4, 8, arg0);
				method32(arg4 + 1, 128, arg0);
			}

			if (arg3 == 3) {
				method32(arg4, 32, arg0);
				method32(arg4, 2, arg0 - 1);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg3 == 0) {
				method32(arg4, 1, arg0);
				method32(arg4 - 1, 16, arg0 + 1);
			}

			if (arg3 == 1) {
				method32(arg4, 4, arg0);
				method32(arg4 + 1, 64, arg0 + 1);
			}

			if (arg3 == 2) {
				method32(arg4, 16, arg0);
				method32(arg4 + 1, 1, arg0 - 1);
			}

			if (arg3 == 3) {
				method32(arg4, 64, arg0);
				method32(arg4 - 1, 4, arg0 - 1);
			}
		}

		if (arg2 == 2) {
			if (arg3 == 0) {
				method32(arg4, 130, arg0);
				method32(arg4 - 1, 8, arg0);
				method32(arg4, 32, arg0 + 1);
			}

			if (arg3 == 1) {
				method32(arg4, 10, arg0);
				method32(arg4, 32, arg0 + 1);
				method32(arg4 + 1, 128, arg0);
			}

			if (arg3 == 2) {
				method32(arg4, 40, arg0);
				method32(arg4 + 1, 128, arg0);
				method32(arg4, 2, arg0 - 1);
			}

			if (arg3 == 3) {
				method32(arg4, 160, arg0);
				method32(arg4, 2, arg0 - 1);
				method32(arg4 - 1, 8, arg0);
			}
		}

		if (arg1) {
			if (arg2 == 0) {
				if (arg3 == 0) {
					method32(arg4, 0x10000, arg0);
					method32(arg4 - 1, 4096, arg0);
				}

				if (arg3 == 1) {
					method32(arg4, 1024, arg0);
					method32(arg4, 16384, arg0 + 1);
				}

				if (arg3 == 2) {
					method32(arg4, 4096, arg0);
					method32(arg4 + 1, 0x10000, arg0);
				}

				if (arg3 == 3) {
					method32(arg4, 16384, arg0);
					method32(arg4, 1024, arg0 - 1);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg3 == 0) {
					method32(arg4, 512, arg0);
					method32(arg4 - 1, 8192, arg0 + 1);
				}

				if (arg3 == 1) {
					method32(arg4, 2048, arg0);
					method32(arg4 + 1, 32768, arg0 + 1);
				}

				if (arg3 == 2) {
					method32(arg4, 8192, arg0);
					method32(arg4 + 1, 512, arg0 - 1);
				}

				if (arg3 == 3) {
					method32(arg4, 32768, arg0);
					method32(arg4 - 1, 2048, arg0 - 1);
				}
			}

			if (arg2 == 2) {
				if (arg3 == 0) {
					method32(arg4, 66560, arg0);
					method32(arg4 - 1, 4096, arg0);
					method32(arg4, 16384, arg0 + 1);
				}

				if (arg3 == 1) {
					method32(arg4, 5120, arg0);
					method32(arg4, 16384, arg0 + 1);
					method32(arg4 + 1, 0x10000, arg0);
				}

				if (arg3 == 2) {
					method32(arg4, 20480, arg0);
					method32(arg4 + 1, 0x10000, arg0);
					method32(arg4, 1024, arg0 - 1);
				}

				if (arg3 == 3) {
					method32(arg4, 81920, arg0);
					method32(arg4, 1024, arg0 - 1);
					method32(arg4 - 1, 4096, arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("CGGBZSOS.a(ZIIZIII)V")
	public void method31(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg2 -= field82;
		arg4 -= field83;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg5;
			arg5 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg2; var9 < arg2 + arg5; var9++) {
			if (var9 >= 0 && var9 < field84) {
				for (int var10 = arg4; var10 < arg1 + arg4; var10++) {
					if (var10 >= 0 && var10 < field85) {
						method32(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("CGGBZSOS.a(IIBI)V")
	public void method32(int arg0, int arg1, int arg2) {
		field86[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("CGGBZSOS.c(III)V")
	public void method33(int arg0, int arg1) {
		arg1 -= field82;
		arg0 -= field83;
		field86[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("CGGBZSOS.a(IIIIIII)Z")
	public boolean method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg4 && arg0 == arg2) {
			return true;
		}

		arg1 -= field82;
		arg0 -= field83;
		arg4 -= field82;
		arg2 -= field83;
		if (arg3 == 0) {
			if (arg5 == 0) {
				if (arg4 - 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg0 && (field86[arg1][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg0 && (field86[arg1][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg1 == arg4 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg4 - 1 == arg1 && arg0 == arg2 && (field86[arg1][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg0 == arg2 && (field86[arg1][arg0] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg4 + 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg0 && (field86[arg1][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg0 && (field86[arg1][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg1 == arg4 && arg2 - 1 == arg0) {
					return true;
				}

				if (arg4 - 1 == arg1 && arg0 == arg2 && (field86[arg1][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg0 == arg2 && (field86[arg1][arg0] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 2) {
			if (arg5 == 0) {
				if (arg4 - 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg0 == arg2 && (field86[arg1][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg0 && (field86[arg1][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg4 - 1 == arg1 && arg0 == arg2 && (field86[arg1][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg0 && (field86[arg1][arg0] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg4 - 1 == arg1 && arg0 == arg2 && (field86[arg1][arg0] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg0 && (field86[arg1][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg4 - 1 == arg1 && arg0 == arg2) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg0 && (field86[arg1][arg0] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg0 == arg2 && (field86[arg1][arg0] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg0) {
					return true;
				}
			}
		}

		if (arg3 == 9) {
			if (arg1 == arg4 && arg2 + 1 == arg0 && (field86[arg1][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg4 && arg2 - 1 == arg0 && (field86[arg1][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg1 && arg0 == arg2 && (field86[arg1][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg1 && arg0 == arg2 && (field86[arg1][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("CGGBZSOS.b(IIIIIII)Z")
	public boolean method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg3 && arg1 == arg5) {
			return true;
		}

		arg3 -= field82;
		arg1 -= field83;
		arg2 -= field82;
		arg5 -= field83;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg2 + 1 == arg3 && arg1 == arg5 && (field86[arg3][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 - 1 == arg1 && (field86[arg3][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg2 - 1 == arg3 && arg1 == arg5 && (field86[arg3][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 - 1 == arg1 && (field86[arg3][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg2 - 1 == arg3 && arg1 == arg5 && (field86[arg3][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 + 1 == arg1 && (field86[arg3][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg2 + 1 == arg3 && arg1 == arg5 && (field86[arg3][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 + 1 == arg1 && (field86[arg3][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 8) {
			if (arg2 == arg3 && arg5 + 1 == arg1 && (field86[arg3][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg3 && arg5 - 1 == arg1 && (field86[arg3][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg3 && arg1 == arg5 && (field86[arg3][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg3 && arg1 == arg5 && (field86[arg3][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("CGGBZSOS.a(BIIIIIII)Z")
	public boolean method36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg3 - 1;
		int var9 = arg0 + arg6 - 1;
		if (arg4 >= arg2 && arg4 <= var8 && arg5 >= arg6 && arg5 <= var9) {
			return true;
		}

		if (arg2 - 1 == arg4 && arg5 >= arg6 && arg5 <= var9 && (field86[arg4 - field82][arg5 - field83] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg4 && arg5 >= arg6 && arg5 <= var9 && (field86[arg4 - field82][arg5 - field83] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg6 - 1 == arg5 && arg4 >= arg2 && arg4 <= var8 && (field86[arg4 - field82][arg5 - field83] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg5 && arg4 >= arg2 && arg4 <= var8 && (field86[arg4 - field82][arg5 - field83] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
